
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl {
    public InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl> newReservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newReservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl> oldReservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldReservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessagePayloadQueryBuilderDsl::of));
    }

}
