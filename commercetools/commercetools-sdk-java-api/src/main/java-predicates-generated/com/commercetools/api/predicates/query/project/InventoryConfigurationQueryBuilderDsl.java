
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class InventoryConfigurationQueryBuilderDsl {
    public InventoryConfigurationQueryBuilderDsl() {
    }

    public static InventoryConfigurationQueryBuilderDsl of() {
        return new InventoryConfigurationQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<InventoryConfigurationQueryBuilderDsl> reservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p, InventoryConfigurationQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<InventoryConfigurationQueryBuilderDsl> releaseExpiredReservations() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("releaseExpiredReservations")),
            p -> new CombinationQueryPredicate<>(p, InventoryConfigurationQueryBuilderDsl::of));
    }

}
