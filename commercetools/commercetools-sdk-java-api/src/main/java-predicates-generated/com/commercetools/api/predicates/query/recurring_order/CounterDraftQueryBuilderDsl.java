
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class CounterDraftQueryBuilderDsl {
    public CounterDraftQueryBuilderDsl() {
    }

    public static CounterDraftQueryBuilderDsl of() {
        return new CounterDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CounterDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CounterDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CounterDraftQueryBuilderDsl> totalToSkip() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("totalToSkip")),
            p -> new CombinationQueryPredicate<>(p, CounterDraftQueryBuilderDsl::of));
    }

}
