package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl  {
    public CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl of() {
        return new CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl> requiresDiscountCode() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requiresDiscountCode")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl::of));
    }
    
}
