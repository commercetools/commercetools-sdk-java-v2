
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelTrackingDataUpdatedMessageQueryBuilderDsl {
    public ParcelTrackingDataUpdatedMessageQueryBuilderDsl() {
    }

    public static ParcelTrackingDataUpdatedMessageQueryBuilderDsl of() {
        return new ParcelTrackingDataUpdatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelTrackingDataUpdatedMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelTrackingDataUpdatedMessageQueryBuilderDsl::of));
    }
}
