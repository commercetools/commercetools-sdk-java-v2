
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ZoneRateQueryBuilderDsl {
    public ZoneRateQueryBuilderDsl() {
    }

    public static ZoneRateQueryBuilderDsl of() {
        return new ZoneRateQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ZoneRateQueryBuilderDsl> zone(
            Function<com.commercetools.api.predicates.query.zone.ZoneReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("zone"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.zone.ZoneReferenceQueryBuilderDsl.of())),
            ZoneRateQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ZoneRateQueryBuilderDsl> shippingRates(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateQueryBuilderDsl.of())),
            ZoneRateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ZoneRateQueryBuilderDsl> shippingRates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingRates")),
            p -> new CombinationQueryPredicate<>(p, ZoneRateQueryBuilderDsl::of));
    }

}
