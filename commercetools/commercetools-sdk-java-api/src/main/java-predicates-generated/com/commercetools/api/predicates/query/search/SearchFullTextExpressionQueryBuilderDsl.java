
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchFullTextExpressionQueryBuilderDsl {
    public SearchFullTextExpressionQueryBuilderDsl() {
    }

    public static SearchFullTextExpressionQueryBuilderDsl of() {
        return new SearchFullTextExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchFullTextExpressionQueryBuilderDsl> fullText(
            Function<com.commercetools.api.predicates.query.search.SearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fullText"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchFullTextValueQueryBuilderDsl.of())),
            SearchFullTextExpressionQueryBuilderDsl::of);
    }

}
