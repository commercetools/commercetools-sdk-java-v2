package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetAnonymousIdActionQueryBuilderDsl  {
    public CartSetAnonymousIdActionQueryBuilderDsl() {
    }

    public static CartSetAnonymousIdActionQueryBuilderDsl of() {
        return new CartSetAnonymousIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetAnonymousIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetAnonymousIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetAnonymousIdActionQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, CartSetAnonymousIdActionQueryBuilderDsl::of));
    }
    
}
