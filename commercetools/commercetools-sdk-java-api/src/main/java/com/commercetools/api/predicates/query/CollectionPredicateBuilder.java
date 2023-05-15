
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class CollectionPredicateBuilder<T> implements EmptyPredicateBuilder<T> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public CollectionPredicateBuilder(final BinaryQueryPredicate predicate,
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
