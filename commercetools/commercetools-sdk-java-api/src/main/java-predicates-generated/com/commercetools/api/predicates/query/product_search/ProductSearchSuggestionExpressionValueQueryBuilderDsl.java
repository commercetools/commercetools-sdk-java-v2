
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchSuggestionExpressionValueQueryBuilderDsl {
    public ProductSearchSuggestionExpressionValueQueryBuilderDsl() {
    }

    public static ProductSearchSuggestionExpressionValueQueryBuilderDsl of() {
        return new ProductSearchSuggestionExpressionValueQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchSuggestionExpressionValueQueryBuilderDsl> asProductSearchSuggestionCompletionExpressionValue(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl
                    .of()),
            ProductSearchSuggestionExpressionValueQueryBuilderDsl::of);
    }
}
