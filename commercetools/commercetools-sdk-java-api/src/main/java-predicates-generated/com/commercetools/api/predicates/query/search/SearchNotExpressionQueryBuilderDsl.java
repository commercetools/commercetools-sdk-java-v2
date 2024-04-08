
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchNotExpressionQueryBuilderDsl {
    public SearchNotExpressionQueryBuilderDsl() {
    }

    public static SearchNotExpressionQueryBuilderDsl of() {
        return new SearchNotExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchNotExpressionQueryBuilderDsl> not(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("not"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            SearchNotExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SearchNotExpressionQueryBuilderDsl> not() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("not")),
            p -> new CombinationQueryPredicate<>(p, SearchNotExpressionQueryBuilderDsl::of));
    }

}
