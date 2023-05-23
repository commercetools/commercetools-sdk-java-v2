
package com.commercetools.api.predicates.query;

import java.util.ArrayList;
import java.util.Collection;

public interface ContainsPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {

    default CombinationQueryPredicate<T> containsAny(final Iterable<TValue> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(v -> p.add(format(v)));
        return combinationFn().apply(predicate().operator(PredicateOperator.CONTAINS.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("any"))
                        .inner(CollectionQueryPredicate.of().predicates(p))));
    }

    default CombinationQueryPredicate<T> containsAll(final Iterable<TValue> value) {
        Collection<QueryPredicate> p = new ArrayList<>();
        value.forEach(v -> p.add(format(v)));
        return combinationFn().apply(predicate().operator(PredicateOperator.CONTAINS.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("all"))
                        .inner(CollectionQueryPredicate.of().predicates(p))));
    }
}
