
package com.commercetools.api.predicates.query;

import static com.commercetools.api.models.InternalUtils.toStream;

import java.util.Collection;
import java.util.stream.Collectors;

public interface IsInPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {

    default CombinationQueryPredicate<T> isIn(final Iterable<TValue> value) {
        Collection<QueryPredicate> p = toStream(value).map(this::format).collect(Collectors.toList());
        ;

        return combinationFn().apply(predicate().operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }

    default CombinationQueryPredicate<T> isInVar(final String variable) {
        return combinationFn().apply(predicate().operator(PredicateOperator.IS_IN.toString())
                .right(VariableQueryPredicate.of().constant(variable)));
    }

}
