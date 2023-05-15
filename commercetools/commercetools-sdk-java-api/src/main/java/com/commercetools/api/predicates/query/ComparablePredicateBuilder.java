
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public interface ComparablePredicateBuilder<T, TValue> {
    BinaryQueryPredicate predicate();

    Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn();

    ConstantQueryPredicate format(final TValue value);

    default CombinationQueryPredicate<T> is(final PredicateOperator operator, final TValue value) {
        return combinationFn().apply(predicate().operator(operator.toString()).right(format(value)));
    }
}
