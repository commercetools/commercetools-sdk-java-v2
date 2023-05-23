
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchKeywordQueryBuilderDsl {
    public SearchKeywordQueryBuilderDsl() {
    }

    public static SearchKeywordQueryBuilderDsl of() {
        return new SearchKeywordQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchKeywordQueryBuilderDsl> text() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("text")),
            p -> new CombinationQueryPredicate<>(p, SearchKeywordQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SearchKeywordQueryBuilderDsl> suggestTokenizer(
            Function<com.commercetools.api.predicates.query.product.SuggestTokenizerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.SuggestTokenizerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("suggestTokenizer"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.SuggestTokenizerQueryBuilderDsl.of())),
            SearchKeywordQueryBuilderDsl::of);
    }

}
