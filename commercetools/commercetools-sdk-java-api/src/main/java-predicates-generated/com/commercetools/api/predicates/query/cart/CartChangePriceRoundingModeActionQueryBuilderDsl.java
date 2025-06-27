
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartChangePriceRoundingModeActionQueryBuilderDsl {
    public CartChangePriceRoundingModeActionQueryBuilderDsl() {
    }

    public static CartChangePriceRoundingModeActionQueryBuilderDsl of() {
        return new CartChangePriceRoundingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangePriceRoundingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangePriceRoundingModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangePriceRoundingModeActionQueryBuilderDsl> priceRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartChangePriceRoundingModeActionQueryBuilderDsl::of));
    }

}
