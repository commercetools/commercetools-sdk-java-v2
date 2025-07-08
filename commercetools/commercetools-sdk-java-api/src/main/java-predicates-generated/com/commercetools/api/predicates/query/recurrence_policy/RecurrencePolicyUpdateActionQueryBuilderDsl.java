
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyUpdateActionQueryBuilderDsl {
    public RecurrencePolicyUpdateActionQueryBuilderDsl() {
    }

    public static RecurrencePolicyUpdateActionQueryBuilderDsl of() {
        return new RecurrencePolicyUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetDescriptionActionQueryBuilderDsl
                    .of()),
            RecurrencePolicyUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetKeyActionQueryBuilderDsl.of()),
            RecurrencePolicyUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetNameActionQueryBuilderDsl.of()),
            RecurrencePolicyUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyUpdateActionQueryBuilderDsl> asSetSchedule(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetScheduleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetScheduleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicySetScheduleActionQueryBuilderDsl
                    .of()),
            RecurrencePolicyUpdateActionQueryBuilderDsl::of);
    }
}
