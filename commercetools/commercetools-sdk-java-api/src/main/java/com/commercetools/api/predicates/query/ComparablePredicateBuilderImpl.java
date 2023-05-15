
package com.commercetools.api.predicates.query;

import java.util.function.Function;

abstract class ComparablePredicateBuilderImpl<T, TValue> implements ComparablePredicateBuilder<T, TValue> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public ComparablePredicateBuilderImpl(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    @Override
    public BinaryQueryPredicate predicate() {
        return predicate;
    }

    @Override
    public Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn() {
        return combinationFn;
    }

}
