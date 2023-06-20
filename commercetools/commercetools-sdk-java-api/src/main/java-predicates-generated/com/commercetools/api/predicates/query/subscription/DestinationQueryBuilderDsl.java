
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DestinationQueryBuilderDsl {
    public DestinationQueryBuilderDsl() {
    }

    public static DestinationQueryBuilderDsl of() {
        return new DestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DestinationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asEventGrid(
            Function<com.commercetools.api.predicates.query.subscription.AzureEventGridDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.AzureEventGridDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.AzureEventGridDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asAzureServiceBus(
            Function<com.commercetools.api.predicates.query.subscription.AzureServiceBusDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.AzureServiceBusDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.subscription.AzureServiceBusDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asConfluentCloud(
            Function<com.commercetools.api.predicates.query.subscription.ConfluentCloudDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ConfluentCloudDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.ConfluentCloudDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asEventBridge(
            Function<com.commercetools.api.predicates.query.subscription.EventBridgeDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.EventBridgeDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.EventBridgeDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asGoogleCloudPubSub(
            Function<com.commercetools.api.predicates.query.subscription.GoogleCloudPubSubDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.GoogleCloudPubSubDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.subscription.GoogleCloudPubSubDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asSns(
            Function<com.commercetools.api.predicates.query.subscription.SnsDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SnsDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.SnsDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DestinationQueryBuilderDsl> asSqs(
            Function<com.commercetools.api.predicates.query.subscription.SqsDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SqsDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.SqsDestinationQueryBuilderDsl.of()),
            DestinationQueryBuilderDsl::of);
    }
}
