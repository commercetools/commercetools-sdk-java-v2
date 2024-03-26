
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl {
    public ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl> by() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("by")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl> order() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("order")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl::of));
    }

}
