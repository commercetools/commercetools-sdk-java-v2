
package com.commercetools.api.predicates.query;

public interface NotEqualPredicateBuilder<T, TValue> {
    CombinationQueryPredicate<T> isNot(final TValue value);
}
