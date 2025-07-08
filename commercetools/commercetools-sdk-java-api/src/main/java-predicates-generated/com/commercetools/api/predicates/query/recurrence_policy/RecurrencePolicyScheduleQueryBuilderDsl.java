
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyScheduleQueryBuilderDsl {
    public RecurrencePolicyScheduleQueryBuilderDsl() {
    }

    public static RecurrencePolicyScheduleQueryBuilderDsl of() {
        return new RecurrencePolicyScheduleQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyScheduleQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyScheduleQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyScheduleQueryBuilderDsl> asDayOfMonth(
            Function<com.commercetools.api.predicates.query.recurrence_policy.DayOfMonthScheduleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.DayOfMonthScheduleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurrence_policy.DayOfMonthScheduleQueryBuilderDsl.of()),
            RecurrencePolicyScheduleQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyScheduleQueryBuilderDsl> asStandard(
            Function<com.commercetools.api.predicates.query.recurrence_policy.StandardScheduleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.StandardScheduleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurrence_policy.StandardScheduleQueryBuilderDsl.of()),
            RecurrencePolicyScheduleQueryBuilderDsl::of);
    }
}
