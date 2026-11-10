
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultQueryBuilderDsl {
    public ProductSearchFacetResultQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultQueryBuilderDsl of() {
        return new ProductSearchFacetResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetResultQueryBuilderDsl> asProductSearchFacetResultBucket(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketQueryBuilderDsl.of()),
            ProductSearchFacetResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchFacetResultQueryBuilderDsl> asProductSearchFacetResultCount(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultCountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultCountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultCountQueryBuilderDsl.of()),
            ProductSearchFacetResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchFacetResultQueryBuilderDsl> asProductSearchFacetResultStats(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultStatsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultStatsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultStatsQueryBuilderDsl.of()),
            ProductSearchFacetResultQueryBuilderDsl::of);
    }
}
