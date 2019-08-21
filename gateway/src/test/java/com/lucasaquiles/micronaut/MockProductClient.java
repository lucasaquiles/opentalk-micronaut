package com.lucasaquiles.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Flowable;

import javax.inject.Singleton;

import static org.junit.jupiter.api.Assertions.*;

@Singleton
@Requires(env = Environment.TEST)
public class MockProductClient implements ProductFetcher{

    @Override
    public Flowable<Product> fetchProducts() {
        Product product = new Product();
        product.setCode("123");
        product.setName("Product 1");

        Product product2 = new Product();
        product2.setCode("321");
        product2.setName("Product 2");

        return Flowable.just(product, product2);
    }
}