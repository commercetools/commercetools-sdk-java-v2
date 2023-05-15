
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.util.function.Function;

public class DateComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, LocalDate>
        implements ComparisonPredicateBuilder<T, LocalDate>, IsInPredicateBuilder<T, LocalDate> {
    public DateComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final LocalDate value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }

}
