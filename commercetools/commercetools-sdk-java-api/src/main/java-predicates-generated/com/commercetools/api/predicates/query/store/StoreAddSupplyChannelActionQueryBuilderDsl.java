
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreAddSupplyChannelActionQueryBuilderDsl {
    public StoreAddSupplyChannelActionQueryBuilderDsl() {
    }

    public static StoreAddSupplyChannelActionQueryBuilderDsl of() {
        return new StoreAddSupplyChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreAddSupplyChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreAddSupplyChannelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreAddSupplyChannelActionQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreAddSupplyChannelActionQueryBuilderDsl::of);
    }

}
