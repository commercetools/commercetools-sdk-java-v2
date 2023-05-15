
package com.commercetools.api.predicates.query;

import java.time.ZonedDateTime;
import java.util.function.Function;

public class DateTimeCollectionPredicateBuilder<T> extends ComparableCollectionPredicateBuilder<T, ZonedDateTime>
        implements ContainsPredicateBuilder<T, ZonedDateTime>, EmptyPredicateBuilder<T> {
    public DateTimeCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
