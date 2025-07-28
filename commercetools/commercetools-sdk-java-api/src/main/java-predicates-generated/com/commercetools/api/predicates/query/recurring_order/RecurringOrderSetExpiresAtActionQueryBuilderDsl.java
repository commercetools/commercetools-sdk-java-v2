
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetExpiresAtActionQueryBuilderDsl {
    public RecurringOrderSetExpiresAtActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetExpiresAtActionQueryBuilderDsl of() {
        return new RecurringOrderSetExpiresAtActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetExpiresAtActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetExpiresAtActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderSetExpiresAtActionQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetExpiresAtActionQueryBuilderDsl::of));
    }

}
