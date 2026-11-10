
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicySetKeyActionQueryBuilderDsl {
    public RecurrencePolicySetKeyActionQueryBuilderDsl() {
    }

    public static RecurrencePolicySetKeyActionQueryBuilderDsl of() {
        return new RecurrencePolicySetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicySetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurrencePolicySetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetKeyActionQueryBuilderDsl::of));
    }

}
