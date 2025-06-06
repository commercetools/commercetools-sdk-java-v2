
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionDraftQueryBuilderDsl {
    public SubscriptionDraftQueryBuilderDsl() {
    }

    public static SubscriptionDraftQueryBuilderDsl of() {
        return new SubscriptionDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SubscriptionDraftQueryBuilderDsl> destination(
            Function<com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("destination"))
                .inner(fn.apply(com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl.of())),
            SubscriptionDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<SubscriptionDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionDraftQueryBuilderDsl> messages(
            Function<com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("messages"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl.of())),
            SubscriptionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionDraftQueryBuilderDsl> messages() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("messages")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionDraftQueryBuilderDsl> changes(
            Function<com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("changes"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl.of())),
            SubscriptionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionDraftQueryBuilderDsl> changes() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("changes")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionDraftQueryBuilderDsl> events(
            Function<com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("events"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl.of())),
            SubscriptionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionDraftQueryBuilderDsl> events() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("events")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionDraftQueryBuilderDsl> format(
            Function<com.commercetools.api.predicates.query.subscription.DeliveryFormatQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DeliveryFormatQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("format"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.DeliveryFormatQueryBuilderDsl.of())),
            SubscriptionDraftQueryBuilderDsl::of);
    }

}
