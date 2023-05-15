
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl {
    public ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl() {
    }

    public static ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl of() {
        return new ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl::of));
    }
}
