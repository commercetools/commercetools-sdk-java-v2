package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPublishedMessagePayloadQueryBuilderDsl  {
    public ProductPublishedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPublishedMessagePayloadQueryBuilderDsl of() {
        return new ProductPublishedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPublishedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessagePayloadQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProductPublishedMessagePayloadQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPublishedMessagePayloadQueryBuilderDsl> productProjection(
        Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productProjection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductPublishedMessagePayloadQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ProductPublishedMessagePayloadQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessagePayloadQueryBuilderDsl::of));
    }
    
}
