package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartChangeTaxModeActionQueryBuilderDsl  {
    public CartChangeTaxModeActionQueryBuilderDsl() {
    }

    public static CartChangeTaxModeActionQueryBuilderDsl of() {
        return new CartChangeTaxModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeTaxModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartChangeTaxModeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartChangeTaxModeActionQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
        p -> new CombinationQueryPredicate<>(p, CartChangeTaxModeActionQueryBuilderDsl::of));
    }
    
}
