
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryChangeQuantityActionQueryBuilderDsl {
    public InventoryEntryChangeQuantityActionQueryBuilderDsl() {
    }

    public static InventoryEntryChangeQuantityActionQueryBuilderDsl of() {
        return new InventoryEntryChangeQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryChangeQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryChangeQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryChangeQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryChangeQuantityActionQueryBuilderDsl::of));
    }
}
