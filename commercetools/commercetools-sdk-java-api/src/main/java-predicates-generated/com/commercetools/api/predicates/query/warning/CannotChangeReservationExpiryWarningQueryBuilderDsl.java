
package com.commercetools.api.predicates.query.warning;

import com.commercetools.api.predicates.query.*;

public class CannotChangeReservationExpiryWarningQueryBuilderDsl {
    public CannotChangeReservationExpiryWarningQueryBuilderDsl() {
    }

    public static CannotChangeReservationExpiryWarningQueryBuilderDsl of() {
        return new CannotChangeReservationExpiryWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CannotChangeReservationExpiryWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, CannotChangeReservationExpiryWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotChangeReservationExpiryWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, CannotChangeReservationExpiryWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotChangeReservationExpiryWarningQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CannotChangeReservationExpiryWarningQueryBuilderDsl::of));
    }

}
