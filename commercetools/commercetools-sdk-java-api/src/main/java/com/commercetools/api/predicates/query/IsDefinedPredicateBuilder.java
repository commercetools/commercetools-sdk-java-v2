
package com.commercetools.api.predicates.query;

public interface IsDefinedPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {

    default CombinationQueryPredicate<T> isDefined() {
        return combinationFn().apply(predicate().operator(PredicateOperator.IS.toString())
                .right(ConstantQueryPredicate.of().constant("defined")));
    }

    default CombinationQueryPredicate<T> isNotDefined() {
        return combinationFn().apply(predicate().operator(PredicateOperator.IS.toString())
                .right(ConstantQueryPredicate.of().constant("not defined")));
    }
}
