package com.lucasaquiles.micronaut

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals


class ProductControllerSpek : Spek({

    describe("test end point to find by stock"){

        val embeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        val client  = HttpClient.create(embeddedServer.url);

        it("GET /inventory/{code}"){

            var request: HttpRequest<Int> = HttpRequest.GET("/inventory/1234")
            val response = client.toBlocking().exchange<Int, Any>(request)

            assertEquals(HttpStatus.OK, response.status)
        }
    }
})