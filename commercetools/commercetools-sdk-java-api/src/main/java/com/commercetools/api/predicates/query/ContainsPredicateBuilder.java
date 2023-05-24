
package com.commercetools.api.predicates.query;

import static com.commercetools.api.models.InternalUtils.toStream;

import java.util.Collection;
import java.util.stream.Collectors;

public interface ContainsPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {

    default CombinationQueryPredicate<T> containsAny(final Iterable<TValue> value) {
        Collection<QueryPredicate> p = toStream(value).map(this::format).collect(Collectors.toList());
        ;

        return combinationFn().apply(predicate().operator(PredicateOperator.CONTAINS.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("any"))
                        .inner(CollectionQueryPredicate.of().predicates(p))));
    }

    default CombinationQueryPredicate<T> containsAll(final Iterable<TValue> value) {
        Collection<QueryPredicate> p = toStream(value).map(this::format).collect(Collectors.toList());
        ;
        return combinationFn().apply(predicate().operator(PredicateOperator.CONTAINS.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("all"))
                        .inner(CollectionQueryPredicate.of().predicates(p))));
    }

    default CombinationQueryPredicate<T> containsAnyVar(final String variable) {
        return combinationFn().apply(predicate().operator(PredicateOperator.CONTAINS.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("any"))
                        .renderInnerWithOutParentheses(true)
                        .inner(VariableQueryPredicate.of().constant(variable))));
    }

    default CombinationQueryPredicate<T> containsAllVar(final String variable) {
        return combinationFn().apply(predicate().operator(PredicateOperator.CONTAINS.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("all"))
                        .renderInnerWithOutParentheses(true)
                        .inner(VariableQueryPredicate.of().constant(variable))));
    }

}
