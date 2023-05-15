
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class BooleanComparisonPredicateBuilder<T> extends ComparablePredicateBuilderImpl<T, Boolean>
        implements ComparisonPredicateBuilder<T, Boolean> {
    public BooleanComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        super(predicate, combinationFn);
    }

    @Override
    public ConstantQueryPredicate format(Boolean value) {
        return ConstantQueryPredicate.of().constant(String.format("%b", value));
    }
}
