
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class NonRecurringOrdersOnlyDraftQueryBuilderDsl {
    public NonRecurringOrdersOnlyDraftQueryBuilderDsl() {
    }

    public static NonRecurringOrdersOnlyDraftQueryBuilderDsl of() {
        return new NonRecurringOrdersOnlyDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<NonRecurringOrdersOnlyDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, NonRecurringOrdersOnlyDraftQueryBuilderDsl::of));
    }

}
