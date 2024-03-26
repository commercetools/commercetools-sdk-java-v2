
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchTimeRangeExpressionQueryBuilderDsl {
    public SearchTimeRangeExpressionQueryBuilderDsl() {
    }

    public static SearchTimeRangeExpressionQueryBuilderDsl of() {
        return new SearchTimeRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchTimeRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.search.SearchTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchTimeRangeValueQueryBuilderDsl.of())),
            SearchTimeRangeExpressionQueryBuilderDsl::of);
    }

}
