
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetReservationExpirationInMinutesActionQueryBuilderDsl {
    public CartSetReservationExpirationInMinutesActionQueryBuilderDsl() {
    }

    public static CartSetReservationExpirationInMinutesActionQueryBuilderDsl of() {
        return new CartSetReservationExpirationInMinutesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetReservationExpirationInMinutesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetReservationExpirationInMinutesActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartSetReservationExpirationInMinutesActionQueryBuilderDsl> reservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p, CartSetReservationExpirationInMinutesActionQueryBuilderDsl::of));
    }

}
