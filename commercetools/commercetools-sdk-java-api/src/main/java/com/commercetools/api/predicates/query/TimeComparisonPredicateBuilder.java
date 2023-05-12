
package com.commercetools.api.predicates.query;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class TimeComparisonPredicateBuilder<T>
        implements EqualityPredicateBuilder<T, LocalTime>, NotEqualPredicateBuilder<T, LocalTime>,
        InequalityPredicateBuilder<T, LocalTime>, IsInPredicateBuilder<T, LocalTime> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public TimeComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    public CombinationQueryPredicate<T> is(final PredicateOperator operator, final LocalTime value) {
        return combinationFn.apply(predicate.operator(operator.toString())
                .right(new ConstantQueryPredicate(
                    String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_TIME)))));
    }

    @Override
    public CombinationQueryPredicate<T> is(final LocalTime value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final LocalTime value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final LocalTime value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final LocalTime value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final LocalTime value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final LocalTime value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isIn(final Iterable<LocalTime> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(s -> p.add(
            ConstantQueryPredicate.of().constant(String.format("\"%s\"", s.format(DateTimeFormatter.ISO_LOCAL_TIME)))));
        return combinationFn.apply(predicate.operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }

}
