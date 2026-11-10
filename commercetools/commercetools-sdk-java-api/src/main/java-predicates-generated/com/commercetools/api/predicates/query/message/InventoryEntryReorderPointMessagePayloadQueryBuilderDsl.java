
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryReorderPointMessagePayloadQueryBuilderDsl {
    public InventoryEntryReorderPointMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntryReorderPointMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntryReorderPointMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryReorderPointMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryReorderPointMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReorderPointMessagePayloadQueryBuilderDsl> quantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReorderPointMessagePayloadQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryReorderPointMessagePayloadQueryBuilderDsl::of);
    }

}
