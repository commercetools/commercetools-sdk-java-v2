
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchCompoundExpressionQueryBuilderDsl {
    public SearchCompoundExpressionQueryBuilderDsl() {
    }

    public static SearchCompoundExpressionQueryBuilderDsl of() {
        return new SearchCompoundExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchCompoundExpressionQueryBuilderDsl> asSearchAndExpression(
            Function<com.commercetools.api.predicates.query.search.SearchAndExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchAndExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchAndExpressionQueryBuilderDsl.of()),
            SearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchCompoundExpressionQueryBuilderDsl> asSearchFilterExpression(
            Function<com.commercetools.api.predicates.query.search.SearchFilterExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFilterExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFilterExpressionQueryBuilderDsl.of()),
            SearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchCompoundExpressionQueryBuilderDsl> asSearchNotExpression(
            Function<com.commercetools.api.predicates.query.search.SearchNotExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchNotExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchNotExpressionQueryBuilderDsl.of()),
            SearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchCompoundExpressionQueryBuilderDsl> asSearchOrExpression(
            Function<com.commercetools.api.predicates.query.search.SearchOrExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchOrExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchOrExpressionQueryBuilderDsl.of()),
            SearchCompoundExpressionQueryBuilderDsl::of);
    }
}
