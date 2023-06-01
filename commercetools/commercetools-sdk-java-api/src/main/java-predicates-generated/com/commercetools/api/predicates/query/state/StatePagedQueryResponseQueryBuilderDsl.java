package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StatePagedQueryResponseQueryBuilderDsl  {
    public StatePagedQueryResponseQueryBuilderDsl() {
    }

    public static StatePagedQueryResponseQueryBuilderDsl of() {
        return new StatePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StatePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, StatePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StatePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, StatePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StatePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, StatePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StatePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, StatePagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StatePagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.state.StateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateQueryBuilderDsl.of())),
            StatePagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StatePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, StatePagedQueryResponseQueryBuilderDsl::of));
    }
    
}
