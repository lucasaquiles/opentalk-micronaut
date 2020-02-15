package com.lucasaquiles.micronaut

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.PageableRepository

@JdbcRepository(dialect = Dialect.H2)
interface ProductRepository extends PageableRepository<Product, UUID> {

    List<Product> findAll()
}