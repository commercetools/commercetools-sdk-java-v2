
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetExpressionQueryBuilderDsl {
    public ProductSearchFacetExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFacetExpressionQueryBuilderDsl> asProductSearchFacetCountExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetCountExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetCountExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetCountExpressionQueryBuilderDsl
                    .of()),
            ProductSearchFacetExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchFacetExpressionQueryBuilderDsl> asProductSearchFacetDistinctExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctExpressionQueryBuilderDsl
                    .of()),
            ProductSearchFacetExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchFacetExpressionQueryBuilderDsl> asProductSearchFacetRangesExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesExpressionQueryBuilderDsl
                    .of()),
            ProductSearchFacetExpressionQueryBuilderDsl::of);
    }
}
