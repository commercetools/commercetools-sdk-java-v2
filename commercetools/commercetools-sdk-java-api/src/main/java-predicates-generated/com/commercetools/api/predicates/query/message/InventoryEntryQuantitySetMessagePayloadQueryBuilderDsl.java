
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl {
    public InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> oldQuantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> newQuantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newQuantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> oldAvailableQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldAvailableQuantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> newAvailableQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newAvailableQuantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl::of);
    }

}
