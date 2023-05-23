
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class StringComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, String>
        implements ComparisonPredicateBuilder<T, String>, IsInPredicateBuilder<T, String> {
    public StringComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final String value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }
}
