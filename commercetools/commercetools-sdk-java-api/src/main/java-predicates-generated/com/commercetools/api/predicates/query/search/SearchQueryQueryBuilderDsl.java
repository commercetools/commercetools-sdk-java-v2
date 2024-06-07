
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchQueryQueryBuilderDsl {
    public SearchQueryQueryBuilderDsl() {
    }

    public static SearchQueryQueryBuilderDsl of() {
        return new SearchQueryQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchQueryQueryBuilderDsl> asSearchCompoundExpression(
            Function<com.commercetools.api.predicates.query.search.SearchCompoundExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchCompoundExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchCompoundExpressionQueryBuilderDsl.of()),
            SearchQueryQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryQueryBuilderDsl> asSearchQueryExpression(
            Function<com.commercetools.api.predicates.query.search.SearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchQueryExpressionQueryBuilderDsl.of()),
            SearchQueryQueryBuilderDsl::of);
    }
}
