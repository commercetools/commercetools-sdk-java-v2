
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchFullTextPrefixExpressionQueryBuilderDsl {
    public SearchFullTextPrefixExpressionQueryBuilderDsl() {
    }

    public static SearchFullTextPrefixExpressionQueryBuilderDsl of() {
        return new SearchFullTextPrefixExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchFullTextPrefixExpressionQueryBuilderDsl> fullTextPrefix(
            Function<com.commercetools.api.predicates.query.search.SearchFullTextPrefixValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFullTextPrefixValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fullTextPrefix"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchFullTextPrefixValueQueryBuilderDsl.of())),
            SearchFullTextPrefixExpressionQueryBuilderDsl::of);
    }

}
