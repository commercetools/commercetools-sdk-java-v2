
package com.commercetools.api.predicates.query;

import java.util.function.Function;

class ComparableCollectionPredicateBuilder<T, TValue> extends CollectionPredicateBuilder<T>
        implements ComparablePredicateBuilder<T, TValue> {

    private final Function<TValue, ConstantQueryPredicate> formatter;

    public ComparableCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn,
            final Function<TValue, ConstantQueryPredicate> formatter) {
        super(predicate, combinationFn);
        this.formatter = formatter;

    }

    @Override
    public ConstantQueryPredicate format(final TValue value) {
        return formatter.apply(value);
    }
}
