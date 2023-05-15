
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class DateComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, LocalDate>
        implements ComparisonPredicateBuilder<T, LocalDate>, IsInPredicateBuilder<T, LocalDate> {
    public DateComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn);
    }

    @Override
    public ConstantQueryPredicate format(LocalDate value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_DATE)));
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final LocalDate value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }
}
