package com.lucasaquiles.micronaut;

import io.reactivex.Flowable;

public interface ProductFetcher {

    Flowable<Product> fetchProducts();
}
