
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryUpdateActionQueryBuilderDsl {
    public InventoryEntryUpdateActionQueryBuilderDsl() {
    }

    public static InventoryEntryUpdateActionQueryBuilderDsl of() {
        return new InventoryEntryUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryUpdateActionQueryBuilderDsl::of));
    }
}
