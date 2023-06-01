package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionUpdateQueryBuilderDsl  {
    public ProductSelectionUpdateQueryBuilderDsl() {
    }

    public static ProductSelectionUpdateQueryBuilderDsl of() {
        return new ProductSelectionUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductSelectionUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductSelectionUpdateActionQueryBuilderDsl.of())),
            ProductSelectionUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductSelectionUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, ProductSelectionUpdateQueryBuilderDsl::of));
    }
    
}
