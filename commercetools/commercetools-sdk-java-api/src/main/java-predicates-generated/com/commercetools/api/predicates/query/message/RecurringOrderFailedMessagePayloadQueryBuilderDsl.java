
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderFailedMessagePayloadQueryBuilderDsl {
    public RecurringOrderFailedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderFailedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderFailedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessagePayloadQueryBuilderDsl> cartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartId")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderFailedMessagePayloadQueryBuilderDsl> failedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessagePayloadQueryBuilderDsl> failureReason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failureReason")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderFailedMessagePayloadQueryBuilderDsl> orderScheduledAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderScheduledAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderFailedMessagePayloadQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl.of())),
            RecurringOrderFailedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurringOrderFailedMessagePayloadQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessagePayloadQueryBuilderDsl::of));
    }

}
