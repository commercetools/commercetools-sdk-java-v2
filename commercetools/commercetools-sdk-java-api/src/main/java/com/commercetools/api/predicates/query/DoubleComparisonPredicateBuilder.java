
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class DoubleComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, Double>
        implements ComparisonPredicateBuilder<T, Double>, IsInPredicateBuilder<T, Double> {
    public DoubleComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }
}
