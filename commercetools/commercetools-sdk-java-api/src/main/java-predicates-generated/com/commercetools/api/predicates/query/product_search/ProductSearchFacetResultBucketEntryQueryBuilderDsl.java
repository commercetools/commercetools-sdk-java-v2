
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultBucketEntryQueryBuilderDsl {
    public ProductSearchFacetResultBucketEntryQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultBucketEntryQueryBuilderDsl of() {
        return new ProductSearchFacetResultBucketEntryQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultBucketEntryQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultBucketEntryQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchFacetResultBucketEntryQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultBucketEntryQueryBuilderDsl::of));
    }

}
