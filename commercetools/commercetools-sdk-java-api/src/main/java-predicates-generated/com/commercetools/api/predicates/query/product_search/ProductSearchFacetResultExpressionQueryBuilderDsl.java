
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultExpressionQueryBuilderDsl {
    public ProductSearchFacetResultExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetResultExpressionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultExpressionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultExpressionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetResultExpressionQueryBuilderDsl> asProductSearchFacetBucketResult(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetBucketResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetBucketResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetBucketResultQueryBuilderDsl.of()),
            ProductSearchFacetResultExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchFacetResultExpressionQueryBuilderDsl> asProductSearchFacetResultCount(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultCountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultCountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultCountQueryBuilderDsl.of()),
            ProductSearchFacetResultExpressionQueryBuilderDsl::of);
    }
}
