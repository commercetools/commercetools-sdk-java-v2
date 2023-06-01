package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetShippingRateInputActionQueryBuilderDsl  {
    public CartSetShippingRateInputActionQueryBuilderDsl() {
    }

    public static CartSetShippingRateInputActionQueryBuilderDsl of() {
        return new CartSetShippingRateInputActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingRateInputActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetShippingRateInputActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetShippingRateInputActionQueryBuilderDsl> shippingRateInput(
        Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            CartSetShippingRateInputActionQueryBuilderDsl::of);
    }
    
    
}
