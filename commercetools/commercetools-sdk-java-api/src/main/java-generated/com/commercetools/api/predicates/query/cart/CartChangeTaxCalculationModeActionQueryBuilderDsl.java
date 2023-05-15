
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartChangeTaxCalculationModeActionQueryBuilderDsl {
    public CartChangeTaxCalculationModeActionQueryBuilderDsl() {
    }

    public static CartChangeTaxCalculationModeActionQueryBuilderDsl of() {
        return new CartChangeTaxCalculationModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeTaxCalculationModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangeTaxCalculationModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeTaxCalculationModeActionQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
            p -> new CombinationQueryPredicate<>(p, CartChangeTaxCalculationModeActionQueryBuilderDsl::of));
    }
}
