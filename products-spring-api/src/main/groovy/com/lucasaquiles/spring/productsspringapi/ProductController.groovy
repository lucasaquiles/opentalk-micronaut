package com.lucasaquiles.spring.productsspringapi

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class ProductController {

    @Autowired
    ProductRepository productRepository

    @GetMapping("/product")
    List<Product> list(){
        productRepository.findAll()
    }
}
