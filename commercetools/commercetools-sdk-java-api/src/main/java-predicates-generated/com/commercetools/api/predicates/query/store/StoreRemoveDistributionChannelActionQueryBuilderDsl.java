package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreRemoveDistributionChannelActionQueryBuilderDsl  {
    public StoreRemoveDistributionChannelActionQueryBuilderDsl() {
    }

    public static StoreRemoveDistributionChannelActionQueryBuilderDsl of() {
        return new StoreRemoveDistributionChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreRemoveDistributionChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreRemoveDistributionChannelActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreRemoveDistributionChannelActionQueryBuilderDsl> distributionChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreRemoveDistributionChannelActionQueryBuilderDsl::of);
    }
    
    
}
