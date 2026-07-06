
package com.commercetools.api.predicates.query.warning;

import com.commercetools.api.predicates.query.*;

public class CannotCreateReservationWarningQueryBuilderDsl {
    public CannotCreateReservationWarningQueryBuilderDsl() {
    }

    public static CannotCreateReservationWarningQueryBuilderDsl of() {
        return new CannotCreateReservationWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CannotCreateReservationWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, CannotCreateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotCreateReservationWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, CannotCreateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotCreateReservationWarningQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, CannotCreateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotCreateReservationWarningQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, CannotCreateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotCreateReservationWarningQueryBuilderDsl> supplyChannel() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannel")),
            p -> new CombinationQueryPredicate<>(p, CannotCreateReservationWarningQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<CannotCreateReservationWarningQueryBuilderDsl> quantity() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CannotCreateReservationWarningQueryBuilderDsl::of));
    }

}
