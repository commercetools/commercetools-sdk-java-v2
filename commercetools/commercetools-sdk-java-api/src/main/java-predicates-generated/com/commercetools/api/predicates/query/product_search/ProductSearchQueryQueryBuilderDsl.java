
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchQueryQueryBuilderDsl {
    public ProductSearchQueryQueryBuilderDsl() {
    }

    public static ProductSearchQueryQueryBuilderDsl of() {
        return new ProductSearchQueryQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchQueryQueryBuilderDsl> asProductSearchCompoundExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchCompoundExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchCompoundExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchCompoundExpressionQueryBuilderDsl.of()),
            ProductSearchQueryQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryQueryBuilderDsl> asProductSearchQueryExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl.of()),
            ProductSearchQueryQueryBuilderDsl::of);
    }
}
