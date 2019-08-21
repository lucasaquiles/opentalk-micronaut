package com.lucasaquiles.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

@Requires(notEnv = Environment.TEST)
@Client("product-inventory")
public interface ProductInventoryClient extends ProductInventoryFetcher{

    @Override
    @Get("/inventory/{code}")
    Maybe<Integer> inventory(String code);
}
