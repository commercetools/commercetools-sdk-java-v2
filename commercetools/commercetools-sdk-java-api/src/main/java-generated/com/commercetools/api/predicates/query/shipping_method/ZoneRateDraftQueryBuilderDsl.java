
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ZoneRateDraftQueryBuilderDsl {
    public ZoneRateDraftQueryBuilderDsl() {
    }

    public static ZoneRateDraftQueryBuilderDsl of() {
        return new ZoneRateDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ZoneRateDraftQueryBuilderDsl> zone(
            Function<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("zone"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.zone.ZoneResourceIdentifierQueryBuilderDsl.of())),
            ZoneRateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ZoneRateDraftQueryBuilderDsl> shippingRates(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            ZoneRateDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ZoneRateDraftQueryBuilderDsl> shippingRates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingRates")),
            p -> new CombinationQueryPredicate<>(p, ZoneRateDraftQueryBuilderDsl::of));
    }
}
