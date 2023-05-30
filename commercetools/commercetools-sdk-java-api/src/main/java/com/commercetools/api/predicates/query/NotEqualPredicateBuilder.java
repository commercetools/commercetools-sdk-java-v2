
package com.commercetools.api.predicates.query;

public interface NotEqualPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {
    default CombinationQueryPredicate<T> isNot(final TValue value) {
        return is(PredicateOperator.IS_NOT, value);
    }

    default CombinationQueryPredicate<T> isNotVar(final String variable) {
        return is(PredicateOperator.IS_NOT, VariableQueryPredicate.of().constant(variable));
    }
}
