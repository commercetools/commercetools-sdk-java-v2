package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountChangeValueActionQueryBuilderDsl  {
    public CartDiscountChangeValueActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeValueActionQueryBuilderDsl of() {
        return new CartDiscountChangeValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountChangeValueActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountChangeValueActionQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl.of())),
            CartDiscountChangeValueActionQueryBuilderDsl::of);
    }
    
    
}
