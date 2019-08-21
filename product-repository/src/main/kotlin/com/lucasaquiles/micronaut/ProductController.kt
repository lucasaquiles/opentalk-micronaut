package com.lucasaquiles.micronaut

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/")
class ProductController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/inventory/{code}")
    fun inventory(code: String): HttpResponse<Int> {
        return when (code) {

            "1234" -> HttpResponse.ok(2)
            "4321" -> HttpResponse.ok(3)
            else -> HttpResponse.notFound()
        }
    }
}