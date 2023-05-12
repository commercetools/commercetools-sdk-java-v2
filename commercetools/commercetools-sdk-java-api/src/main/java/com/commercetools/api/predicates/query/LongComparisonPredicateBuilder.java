
package com.commercetools.api.predicates.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class LongComparisonPredicateBuilder<T> implements EqualityPredicateBuilder<T, Long>,
        NotEqualPredicateBuilder<T, Long>, InequalityPredicateBuilder<T, Long>, IsInPredicateBuilder<T, Long> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public LongComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    public CombinationQueryPredicate<T> is(final PredicateOperator operator, final Long value) {
        return combinationFn.apply(
            predicate.operator(operator.toString()).right(new ConstantQueryPredicate(String.format("%d", value))));
    }

    @Override
    public CombinationQueryPredicate<T> is(final Long value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final Long value) {
        return is(PredicateOperator.IS_NOT, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final Long value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final Long value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final Long value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final Long value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isIn(final Iterable<Long> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(s -> p.add(ConstantQueryPredicate.of().constant(String.format("%d", s))));
        return combinationFn.apply(predicate.operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }
}
