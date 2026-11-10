
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl {
    public RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl> recurrencePolicySchedule(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicySchedule"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl
                            .of())),
            RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl> oldRecurrencePolicySchedule(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldRecurrencePolicySchedule"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl
                            .of())),
            RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl::of);
    }

}
