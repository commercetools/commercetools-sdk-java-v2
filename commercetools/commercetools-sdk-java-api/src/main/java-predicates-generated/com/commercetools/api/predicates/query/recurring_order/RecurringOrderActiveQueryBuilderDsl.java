
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderActiveQueryBuilderDsl {
    public RecurringOrderActiveQueryBuilderDsl() {
    }

    public static RecurringOrderActiveQueryBuilderDsl of() {
        return new RecurringOrderActiveQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderActiveQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderActiveQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderActiveQueryBuilderDsl> resumesAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resumesAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderActiveQueryBuilderDsl::of));
    }

}
