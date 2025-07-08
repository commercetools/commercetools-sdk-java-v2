
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderPausedQueryBuilderDsl {
    public RecurringOrderPausedQueryBuilderDsl() {
    }

    public static RecurringOrderPausedQueryBuilderDsl of() {
        return new RecurringOrderPausedQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderPausedQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderPausedQueryBuilderDsl::of));
    }

}
