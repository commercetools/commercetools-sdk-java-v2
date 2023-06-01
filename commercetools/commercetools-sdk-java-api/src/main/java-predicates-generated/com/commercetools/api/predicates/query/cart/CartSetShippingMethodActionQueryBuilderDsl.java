package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetShippingMethodActionQueryBuilderDsl  {
    public CartSetShippingMethodActionQueryBuilderDsl() {
    }

    public static CartSetShippingMethodActionQueryBuilderDsl of() {
        return new CartSetShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetShippingMethodActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetShippingMethodActionQueryBuilderDsl> shippingMethod(
        Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl.of())),
            CartSetShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartSetShippingMethodActionQueryBuilderDsl> externalTaxRate(
        Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartSetShippingMethodActionQueryBuilderDsl::of);
    }
    
    
}
