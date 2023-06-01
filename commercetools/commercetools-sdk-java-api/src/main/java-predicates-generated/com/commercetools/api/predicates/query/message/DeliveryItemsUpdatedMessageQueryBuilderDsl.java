package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DeliveryItemsUpdatedMessageQueryBuilderDsl  {
    public DeliveryItemsUpdatedMessageQueryBuilderDsl() {
    }

    public static DeliveryItemsUpdatedMessageQueryBuilderDsl of() {
        return new DeliveryItemsUpdatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryItemsUpdatedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<DeliveryItemsUpdatedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryItemsUpdatedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryItemsUpdatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryItemsUpdatedMessageQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryItemsUpdatedMessageQueryBuilderDsl> oldItems(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            DeliveryItemsUpdatedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> oldItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldItems")),
                p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DeliveryItemsUpdatedMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, DeliveryItemsUpdatedMessageQueryBuilderDsl::of));
    }
    
}
