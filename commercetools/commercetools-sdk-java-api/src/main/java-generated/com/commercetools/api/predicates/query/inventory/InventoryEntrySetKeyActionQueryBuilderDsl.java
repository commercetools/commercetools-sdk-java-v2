
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetKeyActionQueryBuilderDsl {
    public InventoryEntrySetKeyActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetKeyActionQueryBuilderDsl of() {
        return new InventoryEntrySetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetKeyActionQueryBuilderDsl::of));
    }
}
