package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetCustomerIdActionQueryBuilderDsl  {
    public CartSetCustomerIdActionQueryBuilderDsl() {
    }

    public static CartSetCustomerIdActionQueryBuilderDsl of() {
        return new CartSetCustomerIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomerIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomerIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetCustomerIdActionQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomerIdActionQueryBuilderDsl::of));
    }
    
}
