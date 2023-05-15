
package com.commercetools.api.predicates.query;

import java.time.ZonedDateTime;
import java.util.function.Function;

public class DateTimeComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, ZonedDateTime>
        implements ComparisonPredicateBuilder<T, ZonedDateTime>, IsInPredicateBuilder<T, ZonedDateTime> {
    public DateTimeComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn, PredicateFormatter::format);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final ZonedDateTime value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }
}
