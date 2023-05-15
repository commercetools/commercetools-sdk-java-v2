
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryResourceIdentifierQueryBuilderDsl {
    public InventoryEntryResourceIdentifierQueryBuilderDsl() {
    }

    public static InventoryEntryResourceIdentifierQueryBuilderDsl of() {
        return new InventoryEntryResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryResourceIdentifierQueryBuilderDsl::of));
    }
}
