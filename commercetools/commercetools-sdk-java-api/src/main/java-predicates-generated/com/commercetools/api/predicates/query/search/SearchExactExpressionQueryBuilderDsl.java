
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchExactExpressionQueryBuilderDsl {
    public SearchExactExpressionQueryBuilderDsl() {
    }

    public static SearchExactExpressionQueryBuilderDsl of() {
        return new SearchExactExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchExactExpressionQueryBuilderDsl> exact(
            Function<com.commercetools.api.predicates.query.search.SearchExactValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchExactValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("exact"))
                .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchExactValueQueryBuilderDsl.of())),
            SearchExactExpressionQueryBuilderDsl::of);
    }

}
