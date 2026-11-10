
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderStateDraftQueryBuilderDsl {
    public RecurringOrderStateDraftQueryBuilderDsl() {
    }

    public static RecurringOrderStateDraftQueryBuilderDsl of() {
        return new RecurringOrderStateDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderStateDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderStateDraftQueryBuilderDsl> asActive(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderActiveQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderActiveQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.RecurringOrderActiveQueryBuilderDsl.of()),
            RecurringOrderStateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderStateDraftQueryBuilderDsl> asCanceled(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderCanceledQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderCanceledQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.RecurringOrderCanceledQueryBuilderDsl.of()),
            RecurringOrderStateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderStateDraftQueryBuilderDsl> asExpired(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderExpiredQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderExpiredQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.RecurringOrderExpiredQueryBuilderDsl.of()),
            RecurringOrderStateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderStateDraftQueryBuilderDsl> asPaused(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderPausedQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderPausedQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.RecurringOrderPausedQueryBuilderDsl.of()),
            RecurringOrderStateDraftQueryBuilderDsl::of);
    }
}
