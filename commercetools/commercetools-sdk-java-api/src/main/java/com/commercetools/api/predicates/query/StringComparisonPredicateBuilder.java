
package com.commercetools.api.predicates.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class StringComparisonPredicateBuilder<T> implements EqualityPredicateBuilder<T, String>,
        NotEqualPredicateBuilder<T, String>, InequalityPredicateBuilder<T, String>, IsInPredicateBuilder<T, String> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public StringComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    public CombinationQueryPredicate<T> is(final PredicateOperator operator, final String value) {
        return combinationFn.apply(
            predicate.operator(operator.toString()).right(new ConstantQueryPredicate(String.format("\"%s\"", value))));
    }

    @Override
    public CombinationQueryPredicate<T> is(final String value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isNot(final String value) {
        return is(PredicateOperator.IS_NOT_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThan(final String value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThan(final String value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    @Override
    public CombinationQueryPredicate<T> isLessThanOrEqual(final String value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isGreaterThanOrEqual(final String value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    @Override
    public CombinationQueryPredicate<T> isIn(final Iterable<String> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(s -> p.add(ConstantQueryPredicate.of().constant(String.format("\"%s\"", s))));
        return combinationFn.apply(predicate.operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }
}
