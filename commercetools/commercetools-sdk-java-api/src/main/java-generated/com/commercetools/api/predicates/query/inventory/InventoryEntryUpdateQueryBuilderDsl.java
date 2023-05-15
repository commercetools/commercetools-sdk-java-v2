
package com.commercetools.api.predicates.query.inventory;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryUpdateQueryBuilderDsl {
    public InventoryEntryUpdateQueryBuilderDsl() {
    }

    public static InventoryEntryUpdateQueryBuilderDsl of() {
        return new InventoryEntryUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<InventoryEntryUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.inventory.InventoryEntryUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.inventory.InventoryEntryUpdateActionQueryBuilderDsl.of())),
            InventoryEntryUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<InventoryEntryUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryUpdateQueryBuilderDsl::of));
    }
}
