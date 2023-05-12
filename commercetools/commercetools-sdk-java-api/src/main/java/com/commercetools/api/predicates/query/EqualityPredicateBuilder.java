
package com.commercetools.api.predicates.query;

public interface EqualityPredicateBuilder<T, TValue> {
    CombinationQueryPredicate<T> is(final TValue value);
}
