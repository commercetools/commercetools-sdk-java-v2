
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchLongRangeExpressionQueryBuilderDsl {
    public SearchLongRangeExpressionQueryBuilderDsl() {
    }

    public static SearchLongRangeExpressionQueryBuilderDsl of() {
        return new SearchLongRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchLongRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.search.SearchLongRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchLongRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchLongRangeValueQueryBuilderDsl.of())),
            SearchLongRangeExpressionQueryBuilderDsl::of);
    }

}
