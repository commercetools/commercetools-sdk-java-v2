
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class CounterQueryBuilderDsl {
    public CounterQueryBuilderDsl() {
    }

    public static CounterQueryBuilderDsl of() {
        return new CounterQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CounterQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CounterQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CounterQueryBuilderDsl> totalToSkip() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("totalToSkip")),
            p -> new CombinationQueryPredicate<>(p, CounterQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CounterQueryBuilderDsl> skipped() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skipped")),
            p -> new CombinationQueryPredicate<>(p, CounterQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CounterQueryBuilderDsl> lastSkippedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastSkippedAt")),
            p -> new CombinationQueryPredicate<>(p, CounterQueryBuilderDsl::of));
    }

}
