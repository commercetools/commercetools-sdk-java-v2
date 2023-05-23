
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreSetSupplyChannelsActionQueryBuilderDsl {
    public StoreSetSupplyChannelsActionQueryBuilderDsl() {
    }

    public static StoreSetSupplyChannelsActionQueryBuilderDsl of() {
        return new StoreSetSupplyChannelsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetSupplyChannelsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetSupplyChannelsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreSetSupplyChannelsActionQueryBuilderDsl> supplyChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannels"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreSetSupplyChannelsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreSetSupplyChannelsActionQueryBuilderDsl> supplyChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreSetSupplyChannelsActionQueryBuilderDsl::of));
    }

}
