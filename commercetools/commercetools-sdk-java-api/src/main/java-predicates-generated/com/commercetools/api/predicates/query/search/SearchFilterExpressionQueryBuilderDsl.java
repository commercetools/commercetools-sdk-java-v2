
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchFilterExpressionQueryBuilderDsl {
    public SearchFilterExpressionQueryBuilderDsl() {
    }

    public static SearchFilterExpressionQueryBuilderDsl of() {
        return new SearchFilterExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchFilterExpressionQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.search.SearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("filter"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.search.SearchQueryExpressionQueryBuilderDsl.of())),
            SearchFilterExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SearchFilterExpressionQueryBuilderDsl> filter() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("filter")),
            p -> new CombinationQueryPredicate<>(p, SearchFilterExpressionQueryBuilderDsl::of));
    }

}
