
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetScheduleActionQueryBuilderDsl {
    public RecurringOrderSetScheduleActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetScheduleActionQueryBuilderDsl of() {
        return new RecurringOrderSetScheduleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetScheduleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetScheduleActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderSetScheduleActionQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl
                            .of())),
            RecurringOrderSetScheduleActionQueryBuilderDsl::of);
    }

}
