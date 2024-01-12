
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchSuggestionExpressionQueryBuilderDsl {
    public ProductSearchSuggestionExpressionQueryBuilderDsl() {
    }

    public static ProductSearchSuggestionExpressionQueryBuilderDsl of() {
        return new ProductSearchSuggestionExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchSuggestionExpressionQueryBuilderDsl> asProductSearchSuggestionCompletionExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionQueryBuilderDsl
                    .of()),
            ProductSearchSuggestionExpressionQueryBuilderDsl::of);
    }
}
