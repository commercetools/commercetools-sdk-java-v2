
package com.commercetools.api.predicates.query;

public interface IsInPredicateBuilder<T, TValue> {
    CombinationQueryPredicate<T> isIn(final Iterable<TValue> value);
}
