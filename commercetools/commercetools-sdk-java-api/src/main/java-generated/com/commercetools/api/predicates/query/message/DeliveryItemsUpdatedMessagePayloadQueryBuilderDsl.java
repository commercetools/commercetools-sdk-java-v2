
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl {
    public DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl of() {
        return new DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> oldItems(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> oldItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldItems")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
}
