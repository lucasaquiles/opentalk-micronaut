package com.lucasaquiles.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/lucasaquiles/micronaut/ProductController;", "", "()V", "inventory", "Lio/micronaut/http/HttpResponse;", "", "code", "", "product-repository"})
@io.micronaut.http.annotation.Controller(value = "/")
public final class ProductController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/inventory/{code}")
    @io.micronaut.http.annotation.Produces(value = {"text/plain"})
    public final io.micronaut.http.HttpResponse<java.lang.Integer> inventory(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public ProductController() {
        super();
    }
}