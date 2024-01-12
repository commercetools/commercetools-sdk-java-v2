
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchSuggestionCompletionExpressionQueryBuilderDsl {
    public ProductSearchSuggestionCompletionExpressionQueryBuilderDsl() {
    }

    public static ProductSearchSuggestionCompletionExpressionQueryBuilderDsl of() {
        return new ProductSearchSuggestionCompletionExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchSuggestionCompletionExpressionQueryBuilderDsl> completion(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("completion"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl
                            .of())),
            ProductSearchSuggestionCompletionExpressionQueryBuilderDsl::of);
    }

}
