package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetCustomerEmailActionQueryBuilderDsl  {
    public CartSetCustomerEmailActionQueryBuilderDsl() {
    }

    public static CartSetCustomerEmailActionQueryBuilderDsl of() {
        return new CartSetCustomerEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomerEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomerEmailActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetCustomerEmailActionQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomerEmailActionQueryBuilderDsl::of));
    }
    
}
