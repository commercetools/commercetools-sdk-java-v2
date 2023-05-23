
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public interface EmptyPredicateBuilder<T> {
    BinaryQueryPredicate predicate();

    Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn();

    default CombinationQueryPredicate<T> isEmpty() {
        return combinationFn().apply(
            predicate().operator(PredicateOperator.IS.toString()).right(ConstantQueryPredicate.of().constant("empty")));
    }
}
