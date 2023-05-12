
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class DateComparisonPredicateBuilder<T>
        implements EqualityPredicateBuilder<T, LocalDate>, NotEqualPredicateBuilder<T, LocalDate>,
        InequalityPredicateBuilder<T, LocalDate>, IsInPredicateBuilder<T, LocalDate> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public DateComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    @Override
    public CombinationQueryPredicate<T> is(final LocalDate value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final LocalDate value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final LocalDate value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final LocalDate value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final LocalDate value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final LocalDate value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    private CombinationQueryPredicate<T> is(final PredicateOperator operator, final LocalDate value) {
        return combinationFn.apply(predicate.operator(operator.toString())
                .right(new ConstantQueryPredicate(
                    String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_DATE)))));
    }

    @Override
    public CombinationQueryPredicate<T> isIn(final Iterable<LocalDate> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(s -> p.add(
            ConstantQueryPredicate.of().constant(String.format("\"%s\"", s.format(DateTimeFormatter.ISO_LOCAL_DATE)))));
        return combinationFn.apply(predicate.operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }
}
