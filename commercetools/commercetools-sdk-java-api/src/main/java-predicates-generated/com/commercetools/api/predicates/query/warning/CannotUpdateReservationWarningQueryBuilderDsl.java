
package com.commercetools.api.predicates.query.warning;

import com.commercetools.api.predicates.query.*;

public class CannotUpdateReservationWarningQueryBuilderDsl {
    public CannotUpdateReservationWarningQueryBuilderDsl() {
    }

    public static CannotUpdateReservationWarningQueryBuilderDsl of() {
        return new CannotUpdateReservationWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> requestedQuantity() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requestedQuantity")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> reservedQuantity() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reservedQuantity")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CannotUpdateReservationWarningQueryBuilderDsl> supplyChannel() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannel")),
            p -> new CombinationQueryPredicate<>(p, CannotUpdateReservationWarningQueryBuilderDsl::of));
    }

}
