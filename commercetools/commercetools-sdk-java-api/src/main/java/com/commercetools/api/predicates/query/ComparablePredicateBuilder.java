
package com.commercetools.api.predicates.query;

import java.util.function.Function;

interface ComparablePredicateBuilder<T, TValue> {
    BinaryQueryPredicate predicate();

    Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn();

    ConstantQueryPredicate format(final TValue value);

    /**
     * create a predicate with the supplied operator and value
     * @param operator the predicate operator
     * @param value the comparison value
     * @return a combination predicate
     */
    default CombinationQueryPredicate<T> is(final PredicateOperator operator, final TValue value) {
        return combinationFn().apply(predicate().operator(operator.toString()).right(format(value)));
    }

    /**
     * create a predicate with the supplied operator and variable name predicate
     * @param operator the predicate operator
     * @param value the variable name predicate
     * @return a combination predicate
     */
    default CombinationQueryPredicate<T> is(final PredicateOperator operator, final VariableQueryPredicate value) {
        return combinationFn().apply(predicate().operator(operator.toString()).right(value));
    }
}
