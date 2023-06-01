package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductAddVariantActionQueryBuilderDsl  {
    public ProductAddVariantActionQueryBuilderDsl() {
    }

    public static ProductAddVariantActionQueryBuilderDsl of() {
        return new ProductAddVariantActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductAddVariantActionQueryBuilderDsl> prices(
        Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("prices"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductAddVariantActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
                p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductAddVariantActionQueryBuilderDsl> images(
        Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("images"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductAddVariantActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
                p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductAddVariantActionQueryBuilderDsl> attributes(
        Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("attributes"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            ProductAddVariantActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
                p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductAddVariantActionQueryBuilderDsl> assets(
        Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("assets"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            ProductAddVariantActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductAddVariantActionQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
                p -> new CombinationQueryPredicate<>(p, ProductAddVariantActionQueryBuilderDsl::of));
    }
    
}
