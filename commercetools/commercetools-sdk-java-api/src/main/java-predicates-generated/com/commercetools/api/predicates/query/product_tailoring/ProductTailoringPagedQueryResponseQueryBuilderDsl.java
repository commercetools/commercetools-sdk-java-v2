
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringPagedQueryResponseQueryBuilderDsl {
    public ProductTailoringPagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductTailoringPagedQueryResponseQueryBuilderDsl of() {
        return new ProductTailoringPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductTailoringPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_tailoring.ProductTailoringQueryBuilderDsl.of())),
            ProductTailoringPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringPagedQueryResponseQueryBuilderDsl::of));
    }

}
