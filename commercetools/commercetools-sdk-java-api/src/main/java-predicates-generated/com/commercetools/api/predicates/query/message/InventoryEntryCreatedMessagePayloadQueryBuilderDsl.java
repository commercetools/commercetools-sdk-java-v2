package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntryCreatedMessagePayloadQueryBuilderDsl  {
    public InventoryEntryCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntryCreatedMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntryCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryCreatedMessagePayloadQueryBuilderDsl> inventoryEntry(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("inventoryEntry"))
            .inner(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl.of())),
            InventoryEntryCreatedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
