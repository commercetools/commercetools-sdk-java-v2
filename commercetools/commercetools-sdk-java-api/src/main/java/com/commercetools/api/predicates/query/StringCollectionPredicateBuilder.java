
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class StringCollectionPredicateBuilder<T> extends ComparableCollectionPredicateBuilder<T, String>
        implements ContainsPredicateBuilder<T, String>, EmptyPredicateBuilder<T> {
    public StringCollectionPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
