
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl {
    public StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl> distributionChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetLineItemDistributionChannelActionQueryBuilderDsl::of);
    }

}
