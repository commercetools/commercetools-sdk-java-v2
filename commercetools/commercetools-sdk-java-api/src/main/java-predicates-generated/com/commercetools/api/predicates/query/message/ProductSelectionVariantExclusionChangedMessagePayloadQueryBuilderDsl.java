package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl  {
    public ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl> oldVariantExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldVariantExclusion"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl> newVariantExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newVariantExclusion"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
