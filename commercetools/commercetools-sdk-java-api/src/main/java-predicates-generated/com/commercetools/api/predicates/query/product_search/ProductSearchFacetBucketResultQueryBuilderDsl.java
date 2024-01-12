
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetBucketResultQueryBuilderDsl {
    public ProductSearchFacetBucketResultQueryBuilderDsl() {
    }

    public static ProductSearchFacetBucketResultQueryBuilderDsl of() {
        return new ProductSearchFacetBucketResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetBucketResultQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetBucketResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetBucketResultQueryBuilderDsl> buckets(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("buckets"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultBucketQueryBuilderDsl
                            .of())),
            ProductSearchFacetBucketResultQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchFacetBucketResultQueryBuilderDsl> buckets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buckets")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetBucketResultQueryBuilderDsl::of));
    }

}
