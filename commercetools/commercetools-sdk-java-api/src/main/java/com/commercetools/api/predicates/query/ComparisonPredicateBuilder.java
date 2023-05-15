
package com.commercetools.api.predicates.query;

public interface ComparisonPredicateBuilder<T, TValue>
        extends EqualityPredicateBuilder<T, TValue>, NotEqualPredicateBuilder<T, TValue>,
        InequalityPredicateBuilder<T, TValue>, IsDefinedPredicateBuilder<T, TValue> {
}
