
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionQueryBuilderDsl {
    public SubscriptionQueryBuilderDsl() {
    }

    public static SubscriptionQueryBuilderDsl of() {
        return new SubscriptionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SubscriptionQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SubscriptionQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SubscriptionQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> destination(
            Function<com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("destination"))
                .inner(fn.apply(com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<SubscriptionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> messages(
            Function<com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("messages"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionQueryBuilderDsl> messages() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("messages")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> changes(
            Function<com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("changes"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionQueryBuilderDsl> changes() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("changes")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> events(
            Function<com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("events"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionQueryBuilderDsl> events() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("events")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionQueryBuilderDsl> format(
            Function<com.commercetools.api.predicates.query.subscription.DeliveryFormatQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DeliveryFormatQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("format"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.DeliveryFormatQueryBuilderDsl.of())),
            SubscriptionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<SubscriptionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionQueryBuilderDsl::of));
    }

}
