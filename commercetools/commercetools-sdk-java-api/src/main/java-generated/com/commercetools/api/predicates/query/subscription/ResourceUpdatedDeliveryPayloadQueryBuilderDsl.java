
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ResourceUpdatedDeliveryPayloadQueryBuilderDsl {
    public ResourceUpdatedDeliveryPayloadQueryBuilderDsl() {
    }

    public static ResourceUpdatedDeliveryPayloadQueryBuilderDsl of() {
        return new ResourceUpdatedDeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
            p -> new CombinationQueryPredicate<>(p, ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> oldVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldVersion")),
            p -> new CombinationQueryPredicate<>(p, ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ResourceUpdatedDeliveryPayloadQueryBuilderDsl> modifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("modifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ResourceUpdatedDeliveryPayloadQueryBuilderDsl::of));
    }
}
