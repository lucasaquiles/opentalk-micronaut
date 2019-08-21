package com.lucasaquiles.micronaut;

import io.reactivex.Maybe;

public interface ProductInventoryFetcher {
    Maybe<Integer> inventory(String code);
}
