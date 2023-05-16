
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryRemoveQuantityActionQueryBuilderDsl {
    public InventoryEntryRemoveQuantityActionQueryBuilderDsl() {
    }

    public static InventoryEntryRemoveQuantityActionQueryBuilderDsl of() {
        return new InventoryEntryRemoveQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryRemoveQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryRemoveQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryRemoveQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryRemoveQuantityActionQueryBuilderDsl::of));
    }

}
