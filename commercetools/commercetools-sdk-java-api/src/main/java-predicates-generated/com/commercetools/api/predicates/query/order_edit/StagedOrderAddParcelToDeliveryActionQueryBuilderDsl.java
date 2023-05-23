
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderAddParcelToDeliveryActionQueryBuilderDsl {
    public StagedOrderAddParcelToDeliveryActionQueryBuilderDsl() {
    }

    public static StagedOrderAddParcelToDeliveryActionQueryBuilderDsl of() {
        return new StagedOrderAddParcelToDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> measurements(
            Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("measurements"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderAddParcelToDeliveryActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

}
