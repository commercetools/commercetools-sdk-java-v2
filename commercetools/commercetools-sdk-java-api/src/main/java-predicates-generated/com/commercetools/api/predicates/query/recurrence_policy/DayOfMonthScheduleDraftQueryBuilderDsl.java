
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class DayOfMonthScheduleDraftQueryBuilderDsl {
    public DayOfMonthScheduleDraftQueryBuilderDsl() {
    }

    public static DayOfMonthScheduleDraftQueryBuilderDsl of() {
        return new DayOfMonthScheduleDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DayOfMonthScheduleDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DayOfMonthScheduleDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DayOfMonthScheduleDraftQueryBuilderDsl> day() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("day")),
            p -> new CombinationQueryPredicate<>(p, DayOfMonthScheduleDraftQueryBuilderDsl::of));
    }

}
