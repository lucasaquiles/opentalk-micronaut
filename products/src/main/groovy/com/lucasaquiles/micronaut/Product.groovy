package com.lucasaquiles.micronaut

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic
@TupleConstructor
class Product{

    String code
    String name
    String description
}