package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountSetKeyActionQueryBuilderDsl  {
    public CartDiscountSetKeyActionQueryBuilderDsl() {
    }

    public static CartDiscountSetKeyActionQueryBuilderDsl of() {
        return new CartDiscountSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountSetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartDiscountSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountSetKeyActionQueryBuilderDsl::of));
    }
    
}
