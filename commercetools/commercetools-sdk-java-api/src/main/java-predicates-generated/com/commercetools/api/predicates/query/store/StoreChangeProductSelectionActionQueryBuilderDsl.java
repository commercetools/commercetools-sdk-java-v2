
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreChangeProductSelectionActionQueryBuilderDsl {
    public StoreChangeProductSelectionActionQueryBuilderDsl() {
    }

    public static StoreChangeProductSelectionActionQueryBuilderDsl of() {
        return new StoreChangeProductSelectionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreChangeProductSelectionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreChangeProductSelectionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreChangeProductSelectionActionQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionResourceIdentifierQueryBuilderDsl
                            .of())),
            StoreChangeProductSelectionActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StoreChangeProductSelectionActionQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, StoreChangeProductSelectionActionQueryBuilderDsl::of));
    }

}
