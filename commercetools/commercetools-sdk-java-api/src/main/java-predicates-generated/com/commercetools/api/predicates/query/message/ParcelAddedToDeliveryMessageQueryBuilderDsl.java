
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelAddedToDeliveryMessageQueryBuilderDsl {
    public ParcelAddedToDeliveryMessageQueryBuilderDsl() {
    }

    public static ParcelAddedToDeliveryMessageQueryBuilderDsl of() {
        return new ParcelAddedToDeliveryMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessageQueryBuilderDsl> delivery(
            Function<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("delivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessageQueryBuilderDsl> parcel(
            Function<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("parcel"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelAddedToDeliveryMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessageQueryBuilderDsl::of));
    }

}
