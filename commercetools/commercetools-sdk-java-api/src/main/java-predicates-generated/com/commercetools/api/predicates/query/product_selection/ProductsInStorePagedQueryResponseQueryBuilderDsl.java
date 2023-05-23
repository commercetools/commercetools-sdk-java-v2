
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductsInStorePagedQueryResponseQueryBuilderDsl {
    public ProductsInStorePagedQueryResponseQueryBuilderDsl() {
    }

    public static ProductsInStorePagedQueryResponseQueryBuilderDsl of() {
        return new ProductsInStorePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductsInStorePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductsInStorePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductsInStorePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductsInStorePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductsInStorePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductsInStorePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductsInStorePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductsInStorePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductsInStorePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionAssignmentQueryBuilderDsl
                            .of())),
            ProductsInStorePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductsInStorePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductsInStorePagedQueryResponseQueryBuilderDsl::of));
    }

}
