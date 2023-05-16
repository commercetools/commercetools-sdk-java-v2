
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionPagedQueryResponseQueryBuilderDsl {
    public ProductSelectionPagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductSelectionPagedQueryResponseQueryBuilderDsl of() {
        return new ProductSelectionPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductSelectionPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl.of())),
            ProductSelectionPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSelectionPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionPagedQueryResponseQueryBuilderDsl::of));
    }

}
