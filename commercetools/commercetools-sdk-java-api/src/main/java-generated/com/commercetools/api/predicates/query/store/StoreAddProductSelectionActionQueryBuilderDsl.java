
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreAddProductSelectionActionQueryBuilderDsl {
    public StoreAddProductSelectionActionQueryBuilderDsl() {
    }

    public static StoreAddProductSelectionActionQueryBuilderDsl of() {
        return new StoreAddProductSelectionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreAddProductSelectionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreAddProductSelectionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreAddProductSelectionActionQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl
                            .of())),
            StoreAddProductSelectionActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StoreAddProductSelectionActionQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, StoreAddProductSelectionActionQueryBuilderDsl::of));
    }
}
