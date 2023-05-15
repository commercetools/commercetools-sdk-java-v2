
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemSupplyChannelActionQueryBuilderDsl {
    public CartSetLineItemSupplyChannelActionQueryBuilderDsl() {
    }

    public static CartSetLineItemSupplyChannelActionQueryBuilderDsl of() {
        return new CartSetLineItemSupplyChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemSupplyChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemSupplyChannelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemSupplyChannelActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemSupplyChannelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetLineItemSupplyChannelActionQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            CartSetLineItemSupplyChannelActionQueryBuilderDsl::of);
    }

}
