
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetParcelTrackingDataActionQueryBuilderDsl {
    public StagedOrderSetParcelTrackingDataActionQueryBuilderDsl() {
    }

    public static StagedOrderSetParcelTrackingDataActionQueryBuilderDsl of() {
        return new StagedOrderSetParcelTrackingDataActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelTrackingDataActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelTrackingDataActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelTrackingDataActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelTrackingDataActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelTrackingDataActionQueryBuilderDsl> parcelKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelTrackingDataActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetParcelTrackingDataActionQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            StagedOrderSetParcelTrackingDataActionQueryBuilderDsl::of);
    }

}
