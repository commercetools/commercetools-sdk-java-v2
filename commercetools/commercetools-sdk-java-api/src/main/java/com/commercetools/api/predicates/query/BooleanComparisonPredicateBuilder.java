
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class BooleanComparisonPredicateBuilder<T> implements EqualityPredicateBuilder<T, Boolean>,
        NotEqualPredicateBuilder<T, Boolean>, InequalityPredicateBuilder<T, Boolean> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public BooleanComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    @Override
    public CombinationQueryPredicate<T> is(final Boolean value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final Boolean value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final Boolean value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final Boolean value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final Boolean value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final Boolean value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    private CombinationQueryPredicate<T> is(final PredicateOperator operator, final Boolean value) {
        return combinationFn.apply(
            predicate.operator(operator.toString()).right(new ConstantQueryPredicate(String.format("%b", value))));
    }
}
