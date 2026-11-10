
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchQueryExpressionValueQueryBuilderDsl {
    public SearchQueryExpressionValueQueryBuilderDsl() {
    }

    public static SearchQueryExpressionValueQueryBuilderDsl of() {
        return new SearchQueryExpressionValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchQueryExpressionValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchQueryExpressionValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchQueryExpressionValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchAnyValue(
            Function<com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchDateRangeValue(
            Function<com.commercetools.api.predicates.query.search.SearchDateRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchDateRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchDateRangeValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchDateTimeRangeValue(
            Function<com.commercetools.api.predicates.query.search.SearchDateTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchDateTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchDateTimeRangeValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchExactValue(
            Function<com.commercetools.api.predicates.query.search.SearchExactValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchExactValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchExactValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchExistsValue(
            Function<com.commercetools.api.predicates.query.search.SearchExistsValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchExistsValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchExistsValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchFullTextPrefixValue(
            Function<com.commercetools.api.predicates.query.search.SearchFullTextPrefixValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFullTextPrefixValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFullTextPrefixValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchFullTextValue(
            Function<com.commercetools.api.predicates.query.search.SearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFullTextValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchFuzzyValue(
            Function<com.commercetools.api.predicates.query.search.SearchFuzzyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFuzzyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchFuzzyValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchLongRangeValue(
            Function<com.commercetools.api.predicates.query.search.SearchLongRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchLongRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchLongRangeValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchNumberRangeValue(
            Function<com.commercetools.api.predicates.query.search.SearchNumberRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchNumberRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchNumberRangeValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchQueryExpressionValueQueryBuilderDsl> asSearchTimeRangeValue(
            Function<com.commercetools.api.predicates.query.search.SearchTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.search.SearchTimeRangeValueQueryBuilderDsl.of()),
            SearchQueryExpressionValueQueryBuilderDsl::of);
    }
}
