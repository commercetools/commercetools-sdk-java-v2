
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemDistributionChannelActionQueryBuilderDsl {
    public CartSetLineItemDistributionChannelActionQueryBuilderDsl() {
    }

    public static CartSetLineItemDistributionChannelActionQueryBuilderDsl of() {
        return new CartSetLineItemDistributionChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemDistributionChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemDistributionChannelActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemDistributionChannelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetLineItemDistributionChannelActionQueryBuilderDsl> distributionChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            CartSetLineItemDistributionChannelActionQueryBuilderDsl::of);
    }

}
