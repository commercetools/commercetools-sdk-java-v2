
package com.commercetools.api.predicates.query;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class TimeComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, LocalTime>
        implements ComparisonPredicateBuilder<T, LocalTime>, IsInPredicateBuilder<T, LocalTime> {
    public TimeComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn);
    }

    @Override
    public ConstantQueryPredicate format(LocalTime value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_TIME)));
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final LocalTime value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }
}
