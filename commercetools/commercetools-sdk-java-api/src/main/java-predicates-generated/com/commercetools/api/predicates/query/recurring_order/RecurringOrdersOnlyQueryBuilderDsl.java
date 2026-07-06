
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrdersOnlyQueryBuilderDsl {
    public RecurringOrdersOnlyQueryBuilderDsl() {
    }

    public static RecurringOrdersOnlyQueryBuilderDsl of() {
        return new RecurringOrdersOnlyQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrdersOnlyQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrdersOnlyQueryBuilderDsl::of));
    }

}
