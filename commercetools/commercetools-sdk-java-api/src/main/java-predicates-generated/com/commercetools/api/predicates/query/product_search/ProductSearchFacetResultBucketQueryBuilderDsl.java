
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultBucketQueryBuilderDsl {
    public ProductSearchFacetResultBucketQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultBucketQueryBuilderDsl of() {
        return new ProductSearchFacetResultBucketQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetResultBucketQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultBucketQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetResultBucketQueryBuilderDsl> buckets(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("buckets"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketEntryQueryBuilderDsl
                            .of())),
            ProductSearchFacetResultBucketQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchFacetResultBucketQueryBuilderDsl> buckets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buckets")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultBucketQueryBuilderDsl::of));
    }

}
