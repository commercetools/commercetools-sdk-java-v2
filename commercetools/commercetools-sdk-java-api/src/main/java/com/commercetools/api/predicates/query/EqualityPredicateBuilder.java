
package com.commercetools.api.predicates.query;

public interface EqualityPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {
    default CombinationQueryPredicate<T> is(final TValue value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    default CombinationQueryPredicate<T> isVar(final String variable) {
        return is(PredicateOperator.IS_EQUAL, VariableQueryPredicate.of().constant(variable));
    }
}
