
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryRemovedMessageQueryBuilderDsl {
    public DeliveryRemovedMessageQueryBuilderDsl() {
    }

    public static DeliveryRemovedMessageQueryBuilderDsl of() {
        return new DeliveryRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DeliveryRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DeliveryRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DeliveryRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DeliveryRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryRemovedMessageQueryBuilderDsl> delivery(
            Function<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("delivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl.of())),
            DeliveryRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DeliveryRemovedMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessageQueryBuilderDsl::of));
    }
}
