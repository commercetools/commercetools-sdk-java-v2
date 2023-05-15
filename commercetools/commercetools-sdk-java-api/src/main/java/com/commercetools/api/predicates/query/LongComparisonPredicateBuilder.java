
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class LongComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, Long>
        implements ComparisonPredicateBuilder<T, Long>, IsInPredicateBuilder<T, Long> {
    public LongComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn);
    }

    @Override
    public ConstantQueryPredicate format(Long value) {
        return ConstantQueryPredicate.of().constant(String.format("%d", value));
    }
}
