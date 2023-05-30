
package com.commercetools.api.predicates.query;

public interface EqualityPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {

    /**
     * creates predicate to a field has the specified value
     * @param value value to be checked for equality
     * @return a combination predicate
     */
    default CombinationQueryPredicate<T> is(final TValue value) {
        return is(PredicateOperator.IS_EQUAL, value);
    }

    /**
     * creates predicate to a field has the value of the supplied variable
     * @param variable variable name
     * @return a combination predicate
     */
    default CombinationQueryPredicate<T> isVar(final String variable) {
        return is(PredicateOperator.IS_EQUAL, VariableQueryPredicate.of().constant(variable));
    }
}
