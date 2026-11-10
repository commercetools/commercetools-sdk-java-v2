
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl {
    public InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl> quantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntrySafetyStockMessagePayloadQueryBuilderDsl::of);
    }

}
