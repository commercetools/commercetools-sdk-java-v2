package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StateChangeInitialActionQueryBuilderDsl  {
    public StateChangeInitialActionQueryBuilderDsl() {
    }

    public static StateChangeInitialActionQueryBuilderDsl of() {
        return new StateChangeInitialActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateChangeInitialActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StateChangeInitialActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<StateChangeInitialActionQueryBuilderDsl> initial() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("initial")),
        p -> new CombinationQueryPredicate<>(p, StateChangeInitialActionQueryBuilderDsl::of));
    }
    
}
