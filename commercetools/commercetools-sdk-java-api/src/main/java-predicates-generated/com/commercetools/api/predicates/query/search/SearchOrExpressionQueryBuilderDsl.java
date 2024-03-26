
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchOrExpressionQueryBuilderDsl {
    public SearchOrExpressionQueryBuilderDsl() {
    }

    public static SearchOrExpressionQueryBuilderDsl of() {
        return new SearchOrExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchOrExpressionQueryBuilderDsl> or(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("or"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            SearchOrExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SearchOrExpressionQueryBuilderDsl> or() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("or")),
            p -> new CombinationQueryPredicate<>(p, SearchOrExpressionQueryBuilderDsl::of));
    }

}
