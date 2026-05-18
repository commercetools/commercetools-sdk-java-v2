
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrdersOnlyDraftQueryBuilderDsl {
    public RecurringOrdersOnlyDraftQueryBuilderDsl() {
    }

    public static RecurringOrdersOnlyDraftQueryBuilderDsl of() {
        return new RecurringOrdersOnlyDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrdersOnlyDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrdersOnlyDraftQueryBuilderDsl::of));
    }

}
