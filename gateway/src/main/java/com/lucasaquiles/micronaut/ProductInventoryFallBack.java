package com.lucasaquiles.micronaut;

import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Maybe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Fallback
public class ProductInventoryFallBack implements ProductInventoryClient{

    Logger logger = LoggerFactory.getLogger(ProductInventoryFallBack.class);

    @Override
    public Maybe<Integer> inventory(String code) {
        logger.info("M=ProductInventoryFallBack.inventory, value={}", "");
        return Maybe.just(0);
    }

}
