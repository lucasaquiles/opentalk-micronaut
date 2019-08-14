package com.lucasaquiles.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.lucasaquiles.micronaut")
                .mainClass(Application.javaClass)
                .start()
    }
}