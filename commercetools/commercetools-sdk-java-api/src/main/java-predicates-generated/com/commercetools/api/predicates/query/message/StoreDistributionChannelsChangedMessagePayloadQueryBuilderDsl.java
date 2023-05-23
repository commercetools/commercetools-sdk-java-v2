
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl {
    public StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl of() {
        return new StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl> addedDistributionChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("addedDistributionChannels"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl> addedDistributionChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedDistributionChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl> removedDistributionChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("removedDistributionChannels"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl> removedDistributionChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedDistributionChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl::of));
    }

}
