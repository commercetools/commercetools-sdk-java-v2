
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodRemoveZoneActionQueryBuilderDsl {
    public ShippingMethodRemoveZoneActionQueryBuilderDsl() {
    }

    public static ShippingMethodRemoveZoneActionQueryBuilderDsl of() {
        return new ShippingMethodRemoveZoneActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodRemoveZoneActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodRemoveZoneActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodRemoveZoneActionQueryBuilderDsl> zone(
            Function<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("zone"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodRemoveZoneActionQueryBuilderDsl::of);
    }

}
