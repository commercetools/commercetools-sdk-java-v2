
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderAddParcelToDeliveryActionQueryBuilderDsl {
    public OrderAddParcelToDeliveryActionQueryBuilderDsl() {
    }

    public static OrderAddParcelToDeliveryActionQueryBuilderDsl of() {
        return new OrderAddParcelToDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderAddParcelToDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderAddParcelToDeliveryActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, OrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderAddParcelToDeliveryActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
            p -> new CombinationQueryPredicate<>(p, OrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderAddParcelToDeliveryActionQueryBuilderDsl> parcelKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelKey")),
            p -> new CombinationQueryPredicate<>(p, OrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderAddParcelToDeliveryActionQueryBuilderDsl> measurements(
            Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("measurements"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            OrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderAddParcelToDeliveryActionQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            OrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderAddParcelToDeliveryActionQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            OrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderAddParcelToDeliveryActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, OrderAddParcelToDeliveryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderAddParcelToDeliveryActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            OrderAddParcelToDeliveryActionQueryBuilderDsl::of);
    }

}
