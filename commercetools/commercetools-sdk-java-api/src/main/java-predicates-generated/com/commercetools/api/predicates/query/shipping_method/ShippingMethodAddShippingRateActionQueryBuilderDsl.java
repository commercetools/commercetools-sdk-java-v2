
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodAddShippingRateActionQueryBuilderDsl {
    public ShippingMethodAddShippingRateActionQueryBuilderDsl() {
    }

    public static ShippingMethodAddShippingRateActionQueryBuilderDsl of() {
        return new ShippingMethodAddShippingRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodAddShippingRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodAddShippingRateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodAddShippingRateActionQueryBuilderDsl> zone(
            Function<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("zone"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodAddShippingRateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodAddShippingRateActionQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            ShippingMethodAddShippingRateActionQueryBuilderDsl::of);
    }

}
