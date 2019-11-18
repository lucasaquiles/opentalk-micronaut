package com.lucasaquiles.micronaut;

import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Maybe;

@Fallback
public class ProductInventoryFallBack implements ProductInventoryClient{

    @Override
    public Maybe<Integer> inventory(String code) {
        return Maybe.just(0);
    }
}
