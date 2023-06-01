package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductProjectionPagedQueryResponseQueryBuilderDsl  {
    public ProductProjectionPagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductProjectionPagedQueryResponseQueryBuilderDsl of() {
        return new ProductProjectionPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductProjectionPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductProjectionPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductProjectionPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductProjectionPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductProjectionPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductProjectionPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductProjectionPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
