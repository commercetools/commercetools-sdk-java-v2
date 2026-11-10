
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyScheduleDraftQueryBuilderDsl {
    public RecurrencePolicyScheduleDraftQueryBuilderDsl() {
    }

    public static RecurrencePolicyScheduleDraftQueryBuilderDsl of() {
        return new RecurrencePolicyScheduleDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyScheduleDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyScheduleDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyScheduleDraftQueryBuilderDsl> asDayOfMonth(
            Function<com.commercetools.api.predicates.query.recurrence_policy.DayOfMonthScheduleDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.DayOfMonthScheduleDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.recurrence_policy.DayOfMonthScheduleDraftQueryBuilderDsl.of()),
            RecurrencePolicyScheduleDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyScheduleDraftQueryBuilderDsl> asStandard(
            Function<com.commercetools.api.predicates.query.recurrence_policy.StandardScheduleDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.StandardScheduleDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.recurrence_policy.StandardScheduleDraftQueryBuilderDsl.of()),
            RecurrencePolicyScheduleDraftQueryBuilderDsl::of);
    }
}
