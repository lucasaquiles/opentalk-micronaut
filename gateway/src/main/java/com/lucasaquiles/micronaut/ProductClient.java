package com.lucasaquiles.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.CircuitBreaker;
import io.reactivex.Flowable;


@Client("products")
@Requires(notEnv = Environment.TEST)
@CircuitBreaker(delay = "5s", attempts = "5", multiplier = "3", reset = "10" )
public interface ProductClient extends ProductFetcher{
    @Override
    @Get("/product/")
    Flowable<Product> fetchProducts();
}
