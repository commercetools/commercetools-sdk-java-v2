
package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

public class StateUpdateActionQueryBuilderDsl {
    public StateUpdateActionQueryBuilderDsl() {
    }

    public static StateUpdateActionQueryBuilderDsl of() {
        return new StateUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateUpdateActionQueryBuilderDsl::of));
    }
}
