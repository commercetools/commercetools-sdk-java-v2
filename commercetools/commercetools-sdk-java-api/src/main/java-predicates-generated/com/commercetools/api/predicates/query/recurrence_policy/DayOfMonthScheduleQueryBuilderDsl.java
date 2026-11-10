
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class DayOfMonthScheduleQueryBuilderDsl {
    public DayOfMonthScheduleQueryBuilderDsl() {
    }

    public static DayOfMonthScheduleQueryBuilderDsl of() {
        return new DayOfMonthScheduleQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DayOfMonthScheduleQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DayOfMonthScheduleQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DayOfMonthScheduleQueryBuilderDsl> day() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("day")),
            p -> new CombinationQueryPredicate<>(p, DayOfMonthScheduleQueryBuilderDsl::of));
    }

}
