
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantDraftQueryBuilderDsl {
    public ProductVariantDraftQueryBuilderDsl() {
    }

    public static ProductVariantDraftQueryBuilderDsl of() {
        return new ProductVariantDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDraftQueryBuilderDsl> prices(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prices"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductVariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantDraftQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDraftQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            ProductVariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantDraftQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDraftQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductVariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantDraftQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDraftQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            ProductVariantDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantDraftQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDraftQueryBuilderDsl::of));
    }

}
