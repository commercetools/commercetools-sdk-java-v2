
package com.commercetools.api.predicates.query;

import java.util.function.Function;

public class ComparisonPredicateBuilder<T> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public ComparisonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    public CombinationQueryPredicate<T> is(final String value) {
        return combinationFn
                .apply(predicate.operator("=").right(new ConstantQueryPredicate(String.format("\"%s\"", value))));
    }
}
