
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetKeyActionQueryBuilderDsl {
    public RecurringOrderSetKeyActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetKeyActionQueryBuilderDsl of() {
        return new RecurringOrderSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetKeyActionQueryBuilderDsl::of));
    }

}
