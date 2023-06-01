package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductVariantDeletedMessagePayloadQueryBuilderDsl  {
    public ProductVariantDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductVariantDeletedMessagePayloadQueryBuilderDsl of() {
        return new ProductVariantDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductVariantDeletedMessagePayloadQueryBuilderDsl> variant(
        Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variant"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductVariantDeletedMessagePayloadQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<ProductVariantDeletedMessagePayloadQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessagePayloadQueryBuilderDsl::of));
    }
    
}
