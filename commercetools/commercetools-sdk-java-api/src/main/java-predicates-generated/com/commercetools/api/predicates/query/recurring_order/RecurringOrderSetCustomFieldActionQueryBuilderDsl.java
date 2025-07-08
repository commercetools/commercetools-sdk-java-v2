
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetCustomFieldActionQueryBuilderDsl {
    public RecurringOrderSetCustomFieldActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetCustomFieldActionQueryBuilderDsl of() {
        return new RecurringOrderSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetCustomFieldActionQueryBuilderDsl::of));
    }

}
