package com.lucasaquiles.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.CircuitBreaker;
import io.reactivex.Maybe;

@Requires(notEnv = Environment.TEST)
@Client("product-inventory")
@CircuitBreaker(delay = "5s",attempts = "5s", reset = "300s")
public interface ProductInventoryClient extends ProductInventoryFetcher{

    @Override
    @Get("/inventory/{code}")
    Maybe<Integer> inventory(String code);
}
