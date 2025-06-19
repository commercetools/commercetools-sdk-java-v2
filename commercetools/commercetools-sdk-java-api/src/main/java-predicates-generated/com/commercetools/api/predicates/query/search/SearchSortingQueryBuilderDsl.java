
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchSortingQueryBuilderDsl {
    public SearchSortingQueryBuilderDsl() {
    }

    public static SearchSortingQueryBuilderDsl of() {
        return new SearchSortingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchSortingQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchSortingQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchSortingQueryBuilderDsl> order() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("order")),
            p -> new CombinationQueryPredicate<>(p, SearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchSortingQueryBuilderDsl> mode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mode")),
            p -> new CombinationQueryPredicate<>(p, SearchSortingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchSortingQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchSortingQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SearchSortingQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("filter"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            SearchSortingQueryBuilderDsl::of);
    }

}
