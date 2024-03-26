
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchWildCardExpressionQueryBuilderDsl {
    public SearchWildCardExpressionQueryBuilderDsl() {
    }

    public static SearchWildCardExpressionQueryBuilderDsl of() {
        return new SearchWildCardExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchWildCardExpressionQueryBuilderDsl> wildcard(
            Function<com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("wildcard"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl.of())),
            SearchWildCardExpressionQueryBuilderDsl::of);
    }

}
