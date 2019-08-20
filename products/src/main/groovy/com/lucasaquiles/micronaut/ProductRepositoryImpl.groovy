package com.lucasaquiles.micronaut

import groovy.transform.CompileStatic

import javax.inject.Singleton

@CompileStatic
@Singleton
class ProductRepositoryImpl implements ProductRepository {

    @Override
    List<Product> findAll() {

        [
                new Product("1491950358", "Guitar with laser", "no description for this"),
                new Product("1680502395", "Guitar with blue laser", "cry with that blue laser"),
        ]
    }
}