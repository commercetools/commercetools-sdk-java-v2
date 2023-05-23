
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountChangeIsActiveActionQueryBuilderDsl {
    public CartDiscountChangeIsActiveActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeIsActiveActionQueryBuilderDsl of() {
        return new CartDiscountChangeIsActiveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeIsActiveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeIsActiveActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CartDiscountChangeIsActiveActionQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeIsActiveActionQueryBuilderDsl::of));
    }

}
