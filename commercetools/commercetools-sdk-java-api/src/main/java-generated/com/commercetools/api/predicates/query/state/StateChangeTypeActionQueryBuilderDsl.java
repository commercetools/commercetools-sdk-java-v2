
package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

public class StateChangeTypeActionQueryBuilderDsl {
    public StateChangeTypeActionQueryBuilderDsl() {
    }

    public static StateChangeTypeActionQueryBuilderDsl of() {
        return new StateChangeTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateChangeTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateChangeTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StateChangeTypeActionQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StateChangeTypeActionQueryBuilderDsl::of));
    }
}
