
package com.commercetools.api.predicates.query;

import java.util.function.Function;

abstract class ComparablePredicateBuilderImpl<T, TValue> implements ComparablePredicateBuilder<T, TValue> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    private final Function<TValue, ConstantQueryPredicate> formatter;

    public ComparablePredicateBuilderImpl(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn,
            final Function<TValue, ConstantQueryPredicate> formatter) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
        this.formatter = formatter;
    }

    @Override
    public BinaryQueryPredicate predicate() {
        return predicate;
    }

    @Override
    public Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn() {
        return combinationFn;
    }

    @Override
    public ConstantQueryPredicate format(final TValue value) {
        return formatter.apply(value);
    }
}
