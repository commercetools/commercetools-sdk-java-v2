package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreRemoveProductSelectionActionQueryBuilderDsl  {
    public StoreRemoveProductSelectionActionQueryBuilderDsl() {
    }

    public static StoreRemoveProductSelectionActionQueryBuilderDsl of() {
        return new StoreRemoveProductSelectionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreRemoveProductSelectionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreRemoveProductSelectionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreRemoveProductSelectionActionQueryBuilderDsl> productSelection(
        Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productSelection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl.of())),
            StoreRemoveProductSelectionActionQueryBuilderDsl::of);
    }
    
    
}
