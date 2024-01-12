
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchCompoundExpressionQueryBuilderDsl {
    public ProductSearchCompoundExpressionQueryBuilderDsl() {
    }

    public static ProductSearchCompoundExpressionQueryBuilderDsl of() {
        return new ProductSearchCompoundExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchCompoundExpressionQueryBuilderDsl> asProductSearchAndExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchAndExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchAndExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchAndExpressionQueryBuilderDsl.of()),
            ProductSearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchCompoundExpressionQueryBuilderDsl> asProductSearchFilterExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFilterExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFilterExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFilterExpressionQueryBuilderDsl.of()),
            ProductSearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchCompoundExpressionQueryBuilderDsl> asProductSearchNotExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchNotExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchNotExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchNotExpressionQueryBuilderDsl.of()),
            ProductSearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchCompoundExpressionQueryBuilderDsl> asProductSearchOrExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchOrExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchOrExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchOrExpressionQueryBuilderDsl.of()),
            ProductSearchCompoundExpressionQueryBuilderDsl::of);
    }
}
