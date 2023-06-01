package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetShippingMethodActionQueryBuilderDsl  {
    public StagedOrderSetShippingMethodActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingMethodActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingMethodActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetShippingMethodActionQueryBuilderDsl> shippingMethod(
        Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderSetShippingMethodActionQueryBuilderDsl> externalTaxRate(
        Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingMethodActionQueryBuilderDsl::of);
    }
    
    
}
