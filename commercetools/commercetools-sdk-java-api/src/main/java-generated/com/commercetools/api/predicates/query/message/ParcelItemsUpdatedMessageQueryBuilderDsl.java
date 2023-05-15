
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelItemsUpdatedMessageQueryBuilderDsl {
    public ParcelItemsUpdatedMessageQueryBuilderDsl() {
    }

    public static ParcelItemsUpdatedMessageQueryBuilderDsl of() {
        return new ParcelItemsUpdatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelItemsUpdatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelItemsUpdatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelItemsUpdatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelItemsUpdatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelItemsUpdatedMessageQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelItemsUpdatedMessageQueryBuilderDsl> oldItems(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            ParcelItemsUpdatedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> oldItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldItems")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelItemsUpdatedMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelItemsUpdatedMessageQueryBuilderDsl::of));
    }
}
