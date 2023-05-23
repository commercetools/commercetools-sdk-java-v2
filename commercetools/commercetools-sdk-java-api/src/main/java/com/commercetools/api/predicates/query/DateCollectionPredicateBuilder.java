
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.util.function.Function;

public class DateCollectionPredicateBuilder<T> extends ComparableCollectionPredicateBuilder<T, LocalDate>
        implements ContainsPredicateBuilder<T, LocalDate>, EmptyPredicateBuilder<T> {
    public DateCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
