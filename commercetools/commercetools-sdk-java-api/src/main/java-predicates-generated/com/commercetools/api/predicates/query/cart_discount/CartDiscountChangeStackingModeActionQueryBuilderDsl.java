
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountChangeStackingModeActionQueryBuilderDsl {
    public CartDiscountChangeStackingModeActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeStackingModeActionQueryBuilderDsl of() {
        return new CartDiscountChangeStackingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeStackingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeStackingModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeStackingModeActionQueryBuilderDsl> stackingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stackingMode")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeStackingModeActionQueryBuilderDsl::of));
    }

}
