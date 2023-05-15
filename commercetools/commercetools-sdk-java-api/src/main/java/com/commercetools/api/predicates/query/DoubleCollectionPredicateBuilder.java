
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class DoubleCollectionPredicateBuilder<T> extends ComparableCollectionPredicateBuilder<T, Double>
        implements ContainsPredicateBuilder<T, Double>, EmptyPredicateBuilder<T> {
    public DoubleCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
