package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartSetShippingMethodActionQueryBuilderDsl  {
    public MyCartSetShippingMethodActionQueryBuilderDsl() {
    }

    public static MyCartSetShippingMethodActionQueryBuilderDsl of() {
        return new MyCartSetShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetShippingMethodActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartSetShippingMethodActionQueryBuilderDsl> shippingMethod(
        Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl.of())),
            MyCartSetShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCartSetShippingMethodActionQueryBuilderDsl> externalTaxRate(
        Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            MyCartSetShippingMethodActionQueryBuilderDsl::of);
    }
    
    
}
