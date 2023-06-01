
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl {
    public StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingMethodTaxRateActionQueryBuilderDsl::of);
    }

}
