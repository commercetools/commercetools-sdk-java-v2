package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StateSetTransitionsActionQueryBuilderDsl  {
    public StateSetTransitionsActionQueryBuilderDsl() {
    }

    public static StateSetTransitionsActionQueryBuilderDsl of() {
        return new StateSetTransitionsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateSetTransitionsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StateSetTransitionsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StateSetTransitionsActionQueryBuilderDsl> transitions(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("transitions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StateSetTransitionsActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StateSetTransitionsActionQueryBuilderDsl> transitions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitions")),
                p -> new CombinationQueryPredicate<>(p, StateSetTransitionsActionQueryBuilderDsl::of));
    }
    
}
