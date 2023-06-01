package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntryReferenceQueryBuilderDsl  {
    public InventoryEntryReferenceQueryBuilderDsl() {
    }

    public static InventoryEntryReferenceQueryBuilderDsl of() {
        return new InventoryEntryReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InventoryEntryReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl.of())),
            InventoryEntryReferenceQueryBuilderDsl::of);
    }
    
    
}
