
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchDateRangeExpressionQueryBuilderDsl {
    public SearchDateRangeExpressionQueryBuilderDsl() {
    }

    public static SearchDateRangeExpressionQueryBuilderDsl of() {
        return new SearchDateRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchDateRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.search.SearchDateRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchDateRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchDateRangeValueQueryBuilderDsl.of())),
            SearchDateRangeExpressionQueryBuilderDsl::of);
    }

}
