
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchFuzzyExpressionQueryBuilderDsl {
    public SearchFuzzyExpressionQueryBuilderDsl() {
    }

    public static SearchFuzzyExpressionQueryBuilderDsl of() {
        return new SearchFuzzyExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchFuzzyExpressionQueryBuilderDsl> fuzzy(
            Function<com.commercetools.api.predicates.query.search.SearchFuzzyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFuzzyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("fuzzy"))
                .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchFuzzyValueQueryBuilderDsl.of())),
            SearchFuzzyExpressionQueryBuilderDsl::of);
    }

}
