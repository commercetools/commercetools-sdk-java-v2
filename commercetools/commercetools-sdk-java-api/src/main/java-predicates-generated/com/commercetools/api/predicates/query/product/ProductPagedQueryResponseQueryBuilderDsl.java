
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPagedQueryResponseQueryBuilderDsl {
    public ProductPagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductPagedQueryResponseQueryBuilderDsl of() {
        return new ProductPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl.of())),
            ProductPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedQueryResponseQueryBuilderDsl::of));
    }

}
