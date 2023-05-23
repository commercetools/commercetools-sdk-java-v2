
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountChangeCartPredicateActionQueryBuilderDsl {
    public CartDiscountChangeCartPredicateActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeCartPredicateActionQueryBuilderDsl of() {
        return new CartDiscountChangeCartPredicateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeCartPredicateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeCartPredicateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeCartPredicateActionQueryBuilderDsl> cartPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartPredicate")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeCartPredicateActionQueryBuilderDsl::of));
    }

}
