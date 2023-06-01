package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartSetLineItemSupplyChannelActionQueryBuilderDsl  {
    public MyCartSetLineItemSupplyChannelActionQueryBuilderDsl() {
    }

    public static MyCartSetLineItemSupplyChannelActionQueryBuilderDsl of() {
        return new MyCartSetLineItemSupplyChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemSupplyChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemSupplyChannelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartSetLineItemSupplyChannelActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemSupplyChannelActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartSetLineItemSupplyChannelActionQueryBuilderDsl> supplyChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            MyCartSetLineItemSupplyChannelActionQueryBuilderDsl::of);
    }
    
    
}
