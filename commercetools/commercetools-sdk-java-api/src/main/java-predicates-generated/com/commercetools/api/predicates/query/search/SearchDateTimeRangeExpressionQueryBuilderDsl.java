
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchDateTimeRangeExpressionQueryBuilderDsl {
    public SearchDateTimeRangeExpressionQueryBuilderDsl() {
    }

    public static SearchDateTimeRangeExpressionQueryBuilderDsl of() {
        return new SearchDateTimeRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchDateTimeRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.search.SearchDateTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchDateTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchDateTimeRangeValueQueryBuilderDsl.of())),
            SearchDateTimeRangeExpressionQueryBuilderDsl::of);
    }

}
