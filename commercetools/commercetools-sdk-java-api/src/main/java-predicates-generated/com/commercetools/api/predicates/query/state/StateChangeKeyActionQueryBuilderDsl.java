
package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

public class StateChangeKeyActionQueryBuilderDsl {
    public StateChangeKeyActionQueryBuilderDsl() {
    }

    public static StateChangeKeyActionQueryBuilderDsl of() {
        return new StateChangeKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateChangeKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateChangeKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StateChangeKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StateChangeKeyActionQueryBuilderDsl::of));
    }

}
