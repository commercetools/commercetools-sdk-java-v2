
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetInventoryLimitsActionQueryBuilderDsl {
    public InventoryEntrySetInventoryLimitsActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetInventoryLimitsActionQueryBuilderDsl of() {
        return new InventoryEntrySetInventoryLimitsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetInventoryLimitsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetInventoryLimitsActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySetInventoryLimitsActionQueryBuilderDsl> minCartQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minCartQuantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetInventoryLimitsActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySetInventoryLimitsActionQueryBuilderDsl> maxCartQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxCartQuantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetInventoryLimitsActionQueryBuilderDsl::of));
    }

}
