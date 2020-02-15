package com.lucasaquiles.micronaut


import io.micronaut.core.annotation.Creator
import io.micronaut.data.annotation.AutoPopulated

import javax.annotation.Nullable
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Product{

    @Id
    @AutoPopulated
    UUID id
    String code
    String name
    String description

    @Creator
    Product(String code, String name,  @Nullable String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }
}