package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreSetDistributionChannelsActionQueryBuilderDsl  {
    public StoreSetDistributionChannelsActionQueryBuilderDsl() {
    }

    public static StoreSetDistributionChannelsActionQueryBuilderDsl of() {
        return new StoreSetDistributionChannelsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetDistributionChannelsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreSetDistributionChannelsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreSetDistributionChannelsActionQueryBuilderDsl> distributionChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreSetDistributionChannelsActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreSetDistributionChannelsActionQueryBuilderDsl> distributionChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("distributionChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreSetDistributionChannelsActionQueryBuilderDsl::of));
    }
    
}
