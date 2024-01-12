
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchQueryExpressionQueryBuilderDsl {
    public ProductSearchQueryExpressionQueryBuilderDsl() {
    }

    public static ProductSearchQueryExpressionQueryBuilderDsl of() {
        return new ProductSearchQueryExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchDateRangeExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchDateTimeRangeExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeExpressionQueryBuilderDsl
                    .of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchExactExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchExactExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchExactExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_search.ProductSearchExactExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchExistsExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchExistsExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchExistsExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchExistsExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchFullTextExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFullTextExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFullTextExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFullTextExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchLongRangeExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchNumberRangeExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeExpressionQueryBuilderDsl
                    .of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchPrefixExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchPrefixExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchPrefixExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchPrefixExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchTimeRangeExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchQueryExpressionQueryBuilderDsl> asProductSearchWildCardExpression(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchWildCardExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchWildCardExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchWildCardExpressionQueryBuilderDsl.of()),
            ProductSearchQueryExpressionQueryBuilderDsl::of);
    }
}
