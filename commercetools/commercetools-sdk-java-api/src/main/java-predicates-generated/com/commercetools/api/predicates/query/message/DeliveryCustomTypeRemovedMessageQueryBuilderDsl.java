
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryCustomTypeRemovedMessageQueryBuilderDsl {
    public DeliveryCustomTypeRemovedMessageQueryBuilderDsl() {
    }

    public static DeliveryCustomTypeRemovedMessageQueryBuilderDsl of() {
        return new DeliveryCustomTypeRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

}
