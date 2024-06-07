
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchPrefixExpressionQueryBuilderDsl {
    public SearchPrefixExpressionQueryBuilderDsl() {
    }

    public static SearchPrefixExpressionQueryBuilderDsl of() {
        return new SearchPrefixExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchPrefixExpressionQueryBuilderDsl> prefix(
            Function<com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prefix"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchAnyValueQueryBuilderDsl.of())),
            SearchPrefixExpressionQueryBuilderDsl::of);
    }

}
