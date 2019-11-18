package com.lucasaquiles.micronaut;

import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable;

@Fallback
public class ProductClientFallback implements ProductClient {
    @Override
    public Flowable<Product> fetchProducts() {
        return Flowable.just(new Product());
    }
}
