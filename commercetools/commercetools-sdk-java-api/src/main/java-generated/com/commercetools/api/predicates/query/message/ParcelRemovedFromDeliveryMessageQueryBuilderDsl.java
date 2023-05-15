
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelRemovedFromDeliveryMessageQueryBuilderDsl {
    public ParcelRemovedFromDeliveryMessageQueryBuilderDsl() {
    }

    public static ParcelRemovedFromDeliveryMessageQueryBuilderDsl of() {
        return new ParcelRemovedFromDeliveryMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> parcel(
            Function<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("parcel"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl.of())),
            ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessageQueryBuilderDsl::of));
    }
}
