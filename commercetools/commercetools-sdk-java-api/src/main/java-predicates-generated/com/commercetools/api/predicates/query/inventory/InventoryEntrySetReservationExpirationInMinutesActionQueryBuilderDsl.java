
package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl {
    public InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl of() {
        return new InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl> reservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntrySetReservationExpirationInMinutesActionQueryBuilderDsl::of));
    }

}
