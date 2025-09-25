
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchQueryExpressionQueryBuilderDsl {
    public SearchQueryExpressionQueryBuilderDsl() {
    }

    public static SearchQueryExpressionQueryBuilderDsl of() {
        return new SearchQueryExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchDateRangeExpression(
            Function<com.commercetools.api.predicates.query.search.SearchDateRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchDateRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchDateRangeExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchDateTimeRangeExpression(
            Function<com.commercetools.api.predicates.query.search.SearchDateTimeRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchDateTimeRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchDateTimeRangeExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchExactExpression(
            Function<com.commercetools.api.predicates.query.search.SearchExactExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchExactExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchExactExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchExistsExpression(
            Function<com.commercetools.api.predicates.query.search.SearchExistsExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchExistsExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchExistsExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchFullTextExpression(
            Function<com.commercetools.api.predicates.query.search.SearchFullTextExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFullTextExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFullTextExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchFullTextPrefixExpression(
            Function<com.commercetools.api.predicates.query.search.SearchFullTextPrefixExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFullTextPrefixExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFullTextPrefixExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchFuzzyExpression(
            Function<com.commercetools.api.predicates.query.search.SearchFuzzyExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFuzzyExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFuzzyExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchLongRangeExpression(
            Function<com.commercetools.api.predicates.query.search.SearchLongRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchLongRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchLongRangeExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchNumberRangeExpression(
            Function<com.commercetools.api.predicates.query.search.SearchNumberRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchNumberRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchNumberRangeExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchPrefixExpression(
            Function<com.commercetools.api.predicates.query.search.SearchPrefixExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchPrefixExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchPrefixExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchTimeRangeExpression(
            Function<com.commercetools.api.predicates.query.search.SearchTimeRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchTimeRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchTimeRangeExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionQueryBuilderDsl> asSearchWildCardExpression(
            Function<com.commercetools.api.predicates.query.search.SearchWildCardExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchWildCardExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchWildCardExpressionQueryBuilderDsl.of()),
            SearchQueryExpressionQueryBuilderDsl::of);
    }
}
