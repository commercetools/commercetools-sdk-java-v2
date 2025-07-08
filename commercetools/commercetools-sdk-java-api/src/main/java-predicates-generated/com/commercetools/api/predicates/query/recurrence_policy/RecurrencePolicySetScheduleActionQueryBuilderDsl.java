
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicySetScheduleActionQueryBuilderDsl {
    public RecurrencePolicySetScheduleActionQueryBuilderDsl() {
    }

    public static RecurrencePolicySetScheduleActionQueryBuilderDsl of() {
        return new RecurrencePolicySetScheduleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicySetScheduleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetScheduleActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicySetScheduleActionQueryBuilderDsl> schedule(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("schedule"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleDraftQueryBuilderDsl
                            .of())),
            RecurrencePolicySetScheduleActionQueryBuilderDsl::of);
    }

}
