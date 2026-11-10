
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class StandardScheduleQueryBuilderDsl {
    public StandardScheduleQueryBuilderDsl() {
    }

    public static StandardScheduleQueryBuilderDsl of() {
        return new StandardScheduleQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandardScheduleQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandardScheduleQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandardScheduleQueryBuilderDsl> value() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StandardScheduleQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandardScheduleQueryBuilderDsl> intervalUnit() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("intervalUnit")),
            p -> new CombinationQueryPredicate<>(p, StandardScheduleQueryBuilderDsl::of));
    }

}
