
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class NonRecurringOrdersOnlyQueryBuilderDsl {
    public NonRecurringOrdersOnlyQueryBuilderDsl() {
    }

    public static NonRecurringOrdersOnlyQueryBuilderDsl of() {
        return new NonRecurringOrdersOnlyQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<NonRecurringOrdersOnlyQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, NonRecurringOrdersOnlyQueryBuilderDsl::of));
    }

}
