
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodRemoveShippingRateActionQueryBuilderDsl {
    public ShippingMethodRemoveShippingRateActionQueryBuilderDsl() {
    }

    public static ShippingMethodRemoveShippingRateActionQueryBuilderDsl of() {
        return new ShippingMethodRemoveShippingRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodRemoveShippingRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodRemoveShippingRateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodRemoveShippingRateActionQueryBuilderDsl> zone(
            Function<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("zone"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodRemoveShippingRateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodRemoveShippingRateActionQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            ShippingMethodRemoveShippingRateActionQueryBuilderDsl::of);
    }

}
