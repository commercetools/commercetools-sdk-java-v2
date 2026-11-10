
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryCustomFieldRemovedMessageQueryBuilderDsl {
    public DeliveryCustomFieldRemovedMessageQueryBuilderDsl() {
    }

    public static DeliveryCustomFieldRemovedMessageQueryBuilderDsl of() {
        return new DeliveryCustomFieldRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldRemovedMessageQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

}
