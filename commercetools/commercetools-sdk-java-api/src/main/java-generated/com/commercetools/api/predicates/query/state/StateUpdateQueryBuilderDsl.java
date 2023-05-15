
package com.commercetools.api.predicates.query.state;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StateUpdateQueryBuilderDsl {
    public StateUpdateQueryBuilderDsl() {
    }

    public static StateUpdateQueryBuilderDsl of() {
        return new StateUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StateUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StateUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StateUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.state.StateUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(com.commercetools.api.predicates.query.state.StateUpdateActionQueryBuilderDsl.of())),
            StateUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StateUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, StateUpdateQueryBuilderDsl::of));
    }
}
