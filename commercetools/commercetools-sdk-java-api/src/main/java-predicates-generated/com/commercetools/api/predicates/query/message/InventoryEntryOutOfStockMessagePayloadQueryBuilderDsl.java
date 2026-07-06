
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl {
    public InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryOutOfStockMessagePayloadQueryBuilderDsl::of);
    }

}
