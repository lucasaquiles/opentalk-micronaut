package com.lucasaquiles.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;


@Client("products")
@Requires(notEnv = Environment.TEST)
public interface ProductClient extends ProductFetcher{
    @Override
    @Get("/product/")
    Flowable<Product> fetchProducts();
}
