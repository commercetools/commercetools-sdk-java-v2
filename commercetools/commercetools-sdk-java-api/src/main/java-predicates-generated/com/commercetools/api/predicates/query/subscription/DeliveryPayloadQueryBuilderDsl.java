
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryPayloadQueryBuilderDsl {
    public DeliveryPayloadQueryBuilderDsl() {
    }

    public static DeliveryPayloadQueryBuilderDsl of() {
        return new DeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryPayloadQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
            p -> new CombinationQueryPredicate<>(p, DeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, DeliveryPayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> asMessage(
            Function<com.commercetools.api.predicates.query.subscription.MessageDeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.MessageDeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.MessageDeliveryPayloadQueryBuilderDsl.of()),
            DeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> asResourceCreated(
            Function<com.commercetools.api.predicates.query.subscription.ResourceCreatedDeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ResourceCreatedDeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.subscription.ResourceCreatedDeliveryPayloadQueryBuilderDsl.of()),
            DeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> asResourceDeleted(
            Function<com.commercetools.api.predicates.query.subscription.ResourceDeletedDeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ResourceDeletedDeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.subscription.ResourceDeletedDeliveryPayloadQueryBuilderDsl.of()),
            DeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> asResourceUpdated(
            Function<com.commercetools.api.predicates.query.subscription.ResourceUpdatedDeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ResourceUpdatedDeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.subscription.ResourceUpdatedDeliveryPayloadQueryBuilderDsl.of()),
            DeliveryPayloadQueryBuilderDsl::of);
    }
}
