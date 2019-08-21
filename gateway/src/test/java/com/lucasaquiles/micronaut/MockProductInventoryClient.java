package com.lucasaquiles.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Maybe;

import javax.inject.Singleton;

@Singleton
@Requires(env = Environment.TEST)
public class MockProductInventoryClient implements ProductInventoryFetcher {
    @Override
    public Maybe<Integer> inventory(String code) {

        if (code.equals("123")) {
            return Maybe.just(2);
        }
        if (code.equals("321")) {
            return Maybe.just(0);
        }

        return Maybe.empty();
    }
}
