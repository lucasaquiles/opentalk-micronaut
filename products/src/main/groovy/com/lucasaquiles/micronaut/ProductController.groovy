package com.lucasaquiles.micronaut

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller("/")
class ProductController{

    private  final ProductRepository productRepository

    ProductController(ProductRepository productRepository){

        this.productRepository = productRepository
    }

    @Get("/product")
    List<Product> list(){
        productRepository.findAll()

    }
}

