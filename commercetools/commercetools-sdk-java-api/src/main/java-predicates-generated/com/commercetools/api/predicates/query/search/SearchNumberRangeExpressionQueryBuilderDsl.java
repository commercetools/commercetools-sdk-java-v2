
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchNumberRangeExpressionQueryBuilderDsl {
    public SearchNumberRangeExpressionQueryBuilderDsl() {
    }

    public static SearchNumberRangeExpressionQueryBuilderDsl of() {
        return new SearchNumberRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchNumberRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.search.SearchNumberRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchNumberRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchNumberRangeValueQueryBuilderDsl.of())),
            SearchNumberRangeExpressionQueryBuilderDsl::of);
    }

}
