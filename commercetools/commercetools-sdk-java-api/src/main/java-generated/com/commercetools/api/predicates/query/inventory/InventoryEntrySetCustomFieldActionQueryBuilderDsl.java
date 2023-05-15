
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetCustomFieldActionQueryBuilderDsl {
    public InventoryEntrySetCustomFieldActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetCustomFieldActionQueryBuilderDsl of() {
        return new InventoryEntrySetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetCustomFieldActionQueryBuilderDsl::of));
    }
}
