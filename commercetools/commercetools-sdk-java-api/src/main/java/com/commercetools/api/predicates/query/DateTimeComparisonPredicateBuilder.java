
package com.commercetools.api.predicates.query;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class DateTimeComparisonPredicateBuilder<T>
        implements EqualityPredicateBuilder<T, ZonedDateTime>, NotEqualPredicateBuilder<T, ZonedDateTime>,
        InequalityPredicateBuilder<T, ZonedDateTime>, IsInPredicateBuilder<T, ZonedDateTime> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    public DateTimeComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    @Override
    public CombinationQueryPredicate<T> is(final ZonedDateTime value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final ZonedDateTime value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final ZonedDateTime value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final ZonedDateTime value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final ZonedDateTime value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final ZonedDateTime value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    private CombinationQueryPredicate<T> is(final PredicateOperator operator, final ZonedDateTime value) {
        return combinationFn.apply(predicate.operator(operator.toString())
                .right(new ConstantQueryPredicate(
                    String.format("\"%s\"", FORMATTER.format(value.withZoneSameInstant(ZoneOffset.UTC))))));
    }

    @Override
    public CombinationQueryPredicate<T> isIn(final Iterable<ZonedDateTime> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(s -> p.add(ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", FORMATTER.format(s.withZoneSameInstant(ZoneOffset.UTC))))));
        return combinationFn.apply(predicate.operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }

}
