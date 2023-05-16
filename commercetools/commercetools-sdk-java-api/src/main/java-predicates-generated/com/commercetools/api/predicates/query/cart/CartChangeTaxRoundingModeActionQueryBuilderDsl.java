
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartChangeTaxRoundingModeActionQueryBuilderDsl {
    public CartChangeTaxRoundingModeActionQueryBuilderDsl() {
    }

    public static CartChangeTaxRoundingModeActionQueryBuilderDsl of() {
        return new CartChangeTaxRoundingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeTaxRoundingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangeTaxRoundingModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeTaxRoundingModeActionQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartChangeTaxRoundingModeActionQueryBuilderDsl::of));
    }

}
