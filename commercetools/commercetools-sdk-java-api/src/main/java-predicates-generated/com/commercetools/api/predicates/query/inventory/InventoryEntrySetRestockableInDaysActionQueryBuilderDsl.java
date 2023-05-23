
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetRestockableInDaysActionQueryBuilderDsl {
    public InventoryEntrySetRestockableInDaysActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetRestockableInDaysActionQueryBuilderDsl of() {
        return new InventoryEntrySetRestockableInDaysActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetRestockableInDaysActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetRestockableInDaysActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySetRestockableInDaysActionQueryBuilderDsl> restockableInDays() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("restockableInDays")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetRestockableInDaysActionQueryBuilderDsl::of));
    }

}
