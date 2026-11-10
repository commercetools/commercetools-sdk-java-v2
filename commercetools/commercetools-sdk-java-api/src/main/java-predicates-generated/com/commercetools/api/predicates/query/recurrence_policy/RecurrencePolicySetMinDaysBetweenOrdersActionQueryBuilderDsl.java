
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl {
    public RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl() {
    }

    public static RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl of() {
        return new RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl> minDaysBetweenOrders() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minDaysBetweenOrders")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetMinDaysBetweenOrdersActionQueryBuilderDsl::of));
    }

}
