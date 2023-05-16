
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelSetGeoLocationActionQueryBuilderDsl {
    public ChannelSetGeoLocationActionQueryBuilderDsl() {
    }

    public static ChannelSetGeoLocationActionQueryBuilderDsl of() {
        return new ChannelSetGeoLocationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetGeoLocationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetGeoLocationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelSetGeoLocationActionQueryBuilderDsl> geoLocation(
            Function<com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("geoLocation"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl.of())),
            ChannelSetGeoLocationActionQueryBuilderDsl::of);
    }

    public GeoJsonPredicateBuilder<ChannelSetGeoLocationActionQueryBuilderDsl> geoLocation() {
        return new GeoJsonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("geoLocation")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetGeoLocationActionQueryBuilderDsl::of));
    }

}
