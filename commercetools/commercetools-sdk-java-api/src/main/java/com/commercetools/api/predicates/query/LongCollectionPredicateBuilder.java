
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class LongCollectionPredicateBuilder<T> extends ComparableCollectionPredicateBuilder<T, Long>
        implements ContainsPredicateBuilder<T, Long>, EmptyPredicateBuilder<T> {
    public LongCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
