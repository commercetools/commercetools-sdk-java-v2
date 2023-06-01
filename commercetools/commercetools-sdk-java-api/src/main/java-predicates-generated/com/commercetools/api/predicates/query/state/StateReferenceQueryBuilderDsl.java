package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StateReferenceQueryBuilderDsl  {
    public StateReferenceQueryBuilderDsl() {
    }

    public static StateReferenceQueryBuilderDsl of() {
        return new StateReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, StateReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StateReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StateReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StateReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.state.StateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateQueryBuilderDsl.of())),
            StateReferenceQueryBuilderDsl::of);
    }
    
    
}
