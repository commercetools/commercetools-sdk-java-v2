
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderRequestOrderNowActionQueryBuilderDsl {
    public RecurringOrderRequestOrderNowActionQueryBuilderDsl() {
    }

    public static RecurringOrderRequestOrderNowActionQueryBuilderDsl of() {
        return new RecurringOrderRequestOrderNowActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderRequestOrderNowActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderRequestOrderNowActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderRequestOrderNowActionQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderRequestOrderNowActionQueryBuilderDsl::of));
    }

}
