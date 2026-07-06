
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetSafetyStockActionQueryBuilderDsl {
    public InventoryEntrySetSafetyStockActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetSafetyStockActionQueryBuilderDsl of() {
        return new InventoryEntrySetSafetyStockActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetSafetyStockActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetSafetyStockActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySetSafetyStockActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetSafetyStockActionQueryBuilderDsl::of));
    }

}
