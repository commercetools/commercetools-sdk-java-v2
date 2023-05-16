
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl {
    public StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl of() {
        return new StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl> addedSupplyChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("addedSupplyChannels"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl> addedSupplyChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedSupplyChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl> removedSupplyChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("removedSupplyChannels"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl> removedSupplyChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedSupplyChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl::of));
    }

}
