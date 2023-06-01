package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetKeyActionQueryBuilderDsl  {
    public CartSetKeyActionQueryBuilderDsl() {
    }

    public static CartSetKeyActionQueryBuilderDsl of() {
        return new CartSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CartSetKeyActionQueryBuilderDsl::of));
    }
    
}
