
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl {
    public InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl of() {
        return new InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl> expectedDelivery() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expectedDelivery")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl::of));
    }

}
