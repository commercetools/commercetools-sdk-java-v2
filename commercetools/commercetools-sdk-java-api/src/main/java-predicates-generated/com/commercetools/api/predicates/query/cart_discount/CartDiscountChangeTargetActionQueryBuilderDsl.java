package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountChangeTargetActionQueryBuilderDsl  {
    public CartDiscountChangeTargetActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeTargetActionQueryBuilderDsl of() {
        return new CartDiscountChangeTargetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeTargetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountChangeTargetActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountChangeTargetActionQueryBuilderDsl> target(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("target"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl.of())),
            CartDiscountChangeTargetActionQueryBuilderDsl::of);
    }
    
    
}
