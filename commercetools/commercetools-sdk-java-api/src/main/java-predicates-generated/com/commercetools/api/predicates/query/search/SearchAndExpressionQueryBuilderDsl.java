
package com.commercetools.api.predicates.query.search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchAndExpressionQueryBuilderDsl {
    public SearchAndExpressionQueryBuilderDsl() {
    }

    public static SearchAndExpressionQueryBuilderDsl of() {
        return new SearchAndExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchAndExpressionQueryBuilderDsl> and(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("and"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            SearchAndExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SearchAndExpressionQueryBuilderDsl> and() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("and")),
            p -> new CombinationQueryPredicate<>(p, SearchAndExpressionQueryBuilderDsl::of));
    }

}
