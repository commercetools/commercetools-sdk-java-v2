package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetShippingRateInputActionQueryBuilderDsl  {
    public StagedOrderSetShippingRateInputActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingRateInputActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingRateInputActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingRateInputActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingRateInputActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetShippingRateInputActionQueryBuilderDsl> shippingRateInput(
        Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingRateInputActionQueryBuilderDsl::of);
    }
    
    
}
