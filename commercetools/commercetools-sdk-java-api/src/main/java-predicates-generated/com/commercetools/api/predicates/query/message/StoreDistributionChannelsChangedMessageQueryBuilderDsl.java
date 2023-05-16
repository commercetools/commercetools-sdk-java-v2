
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreDistributionChannelsChangedMessageQueryBuilderDsl {
    public StoreDistributionChannelsChangedMessageQueryBuilderDsl() {
    }

    public static StoreDistributionChannelsChangedMessageQueryBuilderDsl of() {
        return new StoreDistributionChannelsChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessageQueryBuilderDsl> addedDistributionChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("addedDistributionChannels"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> addedDistributionChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedDistributionChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessageQueryBuilderDsl> removedDistributionChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("removedDistributionChannels"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDistributionChannelsChangedMessageQueryBuilderDsl> removedDistributionChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedDistributionChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessageQueryBuilderDsl::of));
    }

}
