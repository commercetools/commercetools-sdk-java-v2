
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryStockLevelsQueryBuilderDsl {
    public InventoryEntryStockLevelsQueryBuilderDsl() {
    }

    public static InventoryEntryStockLevelsQueryBuilderDsl of() {
        return new InventoryEntryStockLevelsQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<InventoryEntryStockLevelsQueryBuilderDsl> reorderPoint() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reorderPoint")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryStockLevelsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryStockLevelsQueryBuilderDsl> safetyStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("safetyStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryStockLevelsQueryBuilderDsl::of));
    }

}
