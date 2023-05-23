
package com.commercetools.api.predicates.query.inventory;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetSupplyChannelActionQueryBuilderDsl {
    public InventoryEntrySetSupplyChannelActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetSupplyChannelActionQueryBuilderDsl of() {
        return new InventoryEntrySetSupplyChannelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetSupplyChannelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetSupplyChannelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntrySetSupplyChannelActionQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            InventoryEntrySetSupplyChannelActionQueryBuilderDsl::of);
    }

}
