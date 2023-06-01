package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetLocaleActionQueryBuilderDsl  {
    public CartSetLocaleActionQueryBuilderDsl() {
    }

    public static CartSetLocaleActionQueryBuilderDsl of() {
        return new CartSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetLocaleActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
        p -> new CombinationQueryPredicate<>(p, CartSetLocaleActionQueryBuilderDsl::of));
    }
    
}
