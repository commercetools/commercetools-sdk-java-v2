
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryAddQuantityActionQueryBuilderDsl {
    public InventoryEntryAddQuantityActionQueryBuilderDsl() {
    }

    public static InventoryEntryAddQuantityActionQueryBuilderDsl of() {
        return new InventoryEntryAddQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryAddQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryAddQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryAddQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryAddQuantityActionQueryBuilderDsl::of));
    }
}
