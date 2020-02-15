package com.lucasaquiles.micronaut

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.Micronaut
import io.micronaut.runtime.event.annotation.EventListener

import javax.inject.Singleton

@Slf4j
@CompileStatic
@Singleton
class Application {

    final ProductRepository productRepository;

    Application(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    static void main(String[] args) {
        Micronaut.run(Application)
    }



    @EventListener
    void bootstrap(StartupEvent startupEvent) {
        log.info("M=Application.bootstrap, creating products ...")

        final def products = [
                new Product("abcd123", "guitar", ""),
                new Product("123abcd", "box", ""),
                new Product("a1b1c1d1", "phone", ""),
                new Product("a2b2c2d2", "naruto song", ""),
                new Product("a3b3c3d3", "aewsome guitar", ""),
                new Product("a4b4c4d4", "wood guitar", "")

        ]

        productRepository.saveAll(products)
    }
}