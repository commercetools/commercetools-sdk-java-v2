
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetParcelTrackingDataActionQueryBuilderDsl {
    public OrderSetParcelTrackingDataActionQueryBuilderDsl() {
    }

    public static OrderSetParcelTrackingDataActionQueryBuilderDsl of() {
        return new OrderSetParcelTrackingDataActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetParcelTrackingDataActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetParcelTrackingDataActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetParcelTrackingDataActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetParcelTrackingDataActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetParcelTrackingDataActionQueryBuilderDsl> parcelKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetParcelTrackingDataActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetParcelTrackingDataActionQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            OrderSetParcelTrackingDataActionQueryBuilderDsl::of);
    }

}
