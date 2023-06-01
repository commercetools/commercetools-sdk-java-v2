package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ParcelMeasurementsUpdatedMessageQueryBuilderDsl  {
    public ParcelMeasurementsUpdatedMessageQueryBuilderDsl() {
    }

    public static ParcelMeasurementsUpdatedMessageQueryBuilderDsl of() {
        return new ParcelMeasurementsUpdatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> measurements(
        Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("measurements"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessageQueryBuilderDsl::of));
    }
    
}
