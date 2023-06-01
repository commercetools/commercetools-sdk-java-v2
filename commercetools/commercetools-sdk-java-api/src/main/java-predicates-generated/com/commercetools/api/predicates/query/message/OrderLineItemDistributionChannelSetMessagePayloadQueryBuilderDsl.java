package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl  {
    public OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl of() {
        return new OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl> distributionChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
