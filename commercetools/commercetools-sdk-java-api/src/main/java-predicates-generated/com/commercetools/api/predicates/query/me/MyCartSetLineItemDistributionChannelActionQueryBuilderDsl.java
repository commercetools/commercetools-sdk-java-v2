package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartSetLineItemDistributionChannelActionQueryBuilderDsl  {
    public MyCartSetLineItemDistributionChannelActionQueryBuilderDsl() {
    }

    public static MyCartSetLineItemDistributionChannelActionQueryBuilderDsl of() {
        return new MyCartSetLineItemDistributionChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemDistributionChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartSetLineItemDistributionChannelActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartSetLineItemDistributionChannelActionQueryBuilderDsl> distributionChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            MyCartSetLineItemDistributionChannelActionQueryBuilderDsl::of);
    }
    
    
}
