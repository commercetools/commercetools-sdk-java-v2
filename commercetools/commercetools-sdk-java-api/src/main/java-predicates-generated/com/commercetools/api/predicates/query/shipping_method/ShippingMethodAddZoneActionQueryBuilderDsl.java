
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodAddZoneActionQueryBuilderDsl {
    public ShippingMethodAddZoneActionQueryBuilderDsl() {
    }

    public static ShippingMethodAddZoneActionQueryBuilderDsl of() {
        return new ShippingMethodAddZoneActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodAddZoneActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodAddZoneActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodAddZoneActionQueryBuilderDsl> zone(
            Function<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("zone"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodAddZoneActionQueryBuilderDsl::of);
    }

}
