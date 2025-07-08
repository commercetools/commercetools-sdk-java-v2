
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderCanceledQueryBuilderDsl {
    public RecurringOrderCanceledQueryBuilderDsl() {
    }

    public static RecurringOrderCanceledQueryBuilderDsl of() {
        return new RecurringOrderCanceledQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderCanceledQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCanceledQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderCanceledQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCanceledQueryBuilderDsl::of));
    }

}
