package com.lucasaquiles.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

@Controller("/")
public class ProductController {

    private final ProductFetcher productFetcher;
    private final ProductInventoryFetcher productInventoryFetcher;

    public ProductController(ProductFetcher productFetcher, ProductInventoryFetcher productInventoryFetcher) {
        this.productFetcher = productFetcher;
        this.productInventoryFetcher = productInventoryFetcher;
    }

    @Get("/product")
    Flowable<Product> findAll() {
        return productFetcher.fetchProducts()
                .flatMapMaybe(product -> productInventoryFetcher.inventory(product.getCode())
                .filter(stock -> stock > 0)
                .map(stock -> {
                    product.setStock(stock);
                    return product;
                }));
    }
}
