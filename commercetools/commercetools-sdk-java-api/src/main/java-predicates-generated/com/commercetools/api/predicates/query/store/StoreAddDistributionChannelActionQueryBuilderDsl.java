package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreAddDistributionChannelActionQueryBuilderDsl  {
    public StoreAddDistributionChannelActionQueryBuilderDsl() {
    }

    public static StoreAddDistributionChannelActionQueryBuilderDsl of() {
        return new StoreAddDistributionChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreAddDistributionChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreAddDistributionChannelActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreAddDistributionChannelActionQueryBuilderDsl> distributionChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreAddDistributionChannelActionQueryBuilderDsl::of);
    }
    
    
}
