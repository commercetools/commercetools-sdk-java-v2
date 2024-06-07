
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchExistsExpressionQueryBuilderDsl {
    public SearchExistsExpressionQueryBuilderDsl() {
    }

    public static SearchExistsExpressionQueryBuilderDsl of() {
        return new SearchExistsExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchExistsExpressionQueryBuilderDsl> exists(
            Function<com.commercetools.api.predicates.query.search.SearchExistsValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchExistsValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("exists"))
                .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchExistsValueQueryBuilderDsl.of())),
            SearchExistsExpressionQueryBuilderDsl::of);
    }

}
