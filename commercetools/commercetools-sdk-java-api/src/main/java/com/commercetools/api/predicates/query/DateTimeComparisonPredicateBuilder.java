
package com.commercetools.api.predicates.query;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.function.Function;

public class DateTimeComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, ZonedDateTime>
        implements ComparisonPredicateBuilder<T, ZonedDateTime>, IsInPredicateBuilder<T, ZonedDateTime> {
    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    public DateTimeComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn);
    }

    @Override
    public ConstantQueryPredicate format(ZonedDateTime value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", FORMATTER.format(value.withZoneSameInstant(ZoneOffset.UTC))));
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final ZonedDateTime value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }
}
