
package com.commercetools.api.predicates.query;

import java.util.ArrayList;
import java.util.Collection;

public interface IsInPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {

    default CombinationQueryPredicate<T> isIn(final Iterable<TValue> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(v -> p.add(format(v)));
        return combinationFn().apply(predicate().operator(PredicateOperator.IS_IN.toString())
                .right(ContainerQueryPredicate.of().inner(CollectionQueryPredicate.of().predicates(p))));
    }

}
