
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreRemoveSupplyChannelActionQueryBuilderDsl {
    public StoreRemoveSupplyChannelActionQueryBuilderDsl() {
    }

    public static StoreRemoveSupplyChannelActionQueryBuilderDsl of() {
        return new StoreRemoveSupplyChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreRemoveSupplyChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreRemoveSupplyChannelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreRemoveSupplyChannelActionQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreRemoveSupplyChannelActionQueryBuilderDsl::of);
    }

}
