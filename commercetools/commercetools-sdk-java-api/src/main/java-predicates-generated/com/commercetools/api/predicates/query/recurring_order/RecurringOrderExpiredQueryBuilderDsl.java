
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderExpiredQueryBuilderDsl {
    public RecurringOrderExpiredQueryBuilderDsl() {
    }

    public static RecurringOrderExpiredQueryBuilderDsl of() {
        return new RecurringOrderExpiredQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderExpiredQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiredQueryBuilderDsl::of));
    }

}
