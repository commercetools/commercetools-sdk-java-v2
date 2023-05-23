
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDeletedMessagePayloadQueryBuilderDsl {
    public ProductDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductDeletedMessagePayloadQueryBuilderDsl of() {
        return new ProductDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductDeletedMessagePayloadQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDeletedMessagePayloadQueryBuilderDsl> currentProjection(
            Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("currentProjection"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductDeletedMessagePayloadQueryBuilderDsl::of);
    }

}
