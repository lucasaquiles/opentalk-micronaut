package com.lucasaquiles.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductController {

    private static EmbeddedServer embeddedServer;
    private static HttpClient httpClient;

    @BeforeAll
    public static void before() {
        embeddedServer = ApplicationContext.run(EmbeddedServer.class);
        httpClient = embeddedServer.getApplicationContext().createBean(HttpClient.class, embeddedServer.getURL());
    }

    @AfterAll
    public static void after() {
        if(embeddedServer != null) {
            embeddedServer.stop();
        }

        if( httpClient != null ){
            httpClient.stop();
        }
    }

    @Test
    public void retrieveBooks() {

        HttpRequest request = HttpRequest.GET("/product");
        List<Product> books = httpClient.toBlocking().retrieve(request, Argument.of(List.class, Product.class));

        assertNotNull(books);
        assertEquals(1, books.size());

    }
}
