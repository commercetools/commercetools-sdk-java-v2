
package com.commercetools.api.predicates.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class DoubleComparisonPredicateBuilder<T> implements EqualityPredicateBuilder<T, Double>,
        NotEqualPredicateBuilder<T, Double>, InequalityPredicateBuilder<T, Double>, IsInPredicateBuilder<T, Double> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public DoubleComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    @Override
    public CombinationQueryPredicate<T> is(final Double value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final Double value) {
        return is(PredicateOperator.IS_NOT, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final Double value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final Double value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final Double value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final Double value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    public CombinationQueryPredicate<T> is(final PredicateOperator operator, final Double value) {
        return combinationFn
                .apply(predicate.operator(operator.toString()).right(new ConstantQueryPredicate(value.toString())));
    }

    @Override
    public CombinationQueryPredicate<T> isIn(final Iterable<Double> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(s -> p.add(ConstantQueryPredicate.of().constant(s.toString())));
        return combinationFn.apply(predicate.operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }
}
