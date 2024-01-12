
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultBucketQueryBuilderDsl {
    public ProductSearchFacetResultBucketQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultBucketQueryBuilderDsl of() {
        return new ProductSearchFacetResultBucketQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultBucketQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultBucketQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchFacetResultBucketQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultBucketQueryBuilderDsl::of));
    }

}
