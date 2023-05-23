
package com.commercetools.api.predicates.query;

import java.time.LocalTime;
import java.util.function.Function;

public class TimeCollectionPredicateBuilder<T> extends ComparableCollectionPredicateBuilder<T, LocalTime>
        implements ContainsPredicateBuilder<T, LocalTime>, EmptyPredicateBuilder<T> {
    public TimeCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
