
package com.commercetools.api.predicates.query;

public interface InequalityPredicateBuilder<T, TValue> extends ComparablePredicateBuilder<T, TValue> {
    default CombinationQueryPredicate<T> isLessThan(final TValue value) {
        return is(PredicateOperator.IS_LESS_THAN, value);
    }

    default CombinationQueryPredicate<T> isGreaterThan(final TValue value) {
        return is(PredicateOperator.IS_GREATER_THAN, value);
    }

    default CombinationQueryPredicate<T> isLessThanOrEqual(final TValue value) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, value);
    }

    default CombinationQueryPredicate<T> isGreaterThanOrEqual(final TValue value) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, value);
    }

    default CombinationQueryPredicate<T> isLessThanVar(final String variable) {
        return is(PredicateOperator.IS_LESS_THAN, VariableQueryPredicate.of().constant(variable));
    }

    default CombinationQueryPredicate<T> isGreaterThanVar(final String variable) {
        return is(PredicateOperator.IS_GREATER_THAN, VariableQueryPredicate.of().constant(variable));
    }

    default CombinationQueryPredicate<T> isLessThanOrEqualVar(final String variable) {
        return is(PredicateOperator.IS_LESS_THAN_OR_EQUAL, VariableQueryPredicate.of().constant(variable));
    }

    default CombinationQueryPredicate<T> isGreaterThanOrEqualVar(final String variable) {
        return is(PredicateOperator.IS_GREATER_THAN_OR_EQUAL, VariableQueryPredicate.of().constant(variable));
    }
}
