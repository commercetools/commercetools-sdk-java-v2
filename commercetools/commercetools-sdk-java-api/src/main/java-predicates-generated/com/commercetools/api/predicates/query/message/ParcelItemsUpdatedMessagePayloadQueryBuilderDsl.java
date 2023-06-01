package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ParcelItemsUpdatedMessagePayloadQueryBuilderDsl  {
    public ParcelItemsUpdatedMessagePayloadQueryBuilderDsl() {
    }

    public static ParcelItemsUpdatedMessagePayloadQueryBuilderDsl of() {
        return new ParcelItemsUpdatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> oldItems(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> oldItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldItems")),
                p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    
}
