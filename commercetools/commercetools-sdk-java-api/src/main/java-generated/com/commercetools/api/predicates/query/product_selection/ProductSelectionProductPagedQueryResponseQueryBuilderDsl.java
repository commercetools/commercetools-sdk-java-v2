
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionProductPagedQueryResponseQueryBuilderDsl {
    public ProductSelectionProductPagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductSelectionProductPagedQueryResponseQueryBuilderDsl of() {
        return new ProductSelectionProductPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionProductPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_selection.AssignedProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.AssignedProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.AssignedProductReferenceQueryBuilderDsl
                            .of())),
            ProductSelectionProductPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSelectionProductPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductPagedQueryResponseQueryBuilderDsl::of));
    }
}
