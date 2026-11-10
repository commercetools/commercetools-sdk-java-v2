
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetStartsAtActionQueryBuilderDsl {
    public RecurringOrderSetStartsAtActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetStartsAtActionQueryBuilderDsl of() {
        return new RecurringOrderSetStartsAtActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetStartsAtActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetStartsAtActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderSetStartsAtActionQueryBuilderDsl> startsAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("startsAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetStartsAtActionQueryBuilderDsl::of));
    }

}
