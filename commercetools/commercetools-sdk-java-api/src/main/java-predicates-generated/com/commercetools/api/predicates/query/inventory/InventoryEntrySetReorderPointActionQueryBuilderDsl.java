
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetReorderPointActionQueryBuilderDsl {
    public InventoryEntrySetReorderPointActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetReorderPointActionQueryBuilderDsl of() {
        return new InventoryEntrySetReorderPointActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetReorderPointActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetReorderPointActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySetReorderPointActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetReorderPointActionQueryBuilderDsl::of));
    }

}
