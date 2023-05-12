
package com.commercetools.api.predicates.query;

public interface InequalityPredicateBuilder<T, TValue> {
    CombinationQueryPredicate<T> isLessThan(final TValue value);

    CombinationQueryPredicate<T> isGreaterThan(final TValue value);

    CombinationQueryPredicate<T> isLessThanOrEqual(final TValue value);

    CombinationQueryPredicate<T> isGreaterThanOrEqual(final TValue value);
}
