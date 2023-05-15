
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantQueryBuilderDsl {
    public ProductVariantQueryBuilderDsl() {
    }

    public static ProductVariantQueryBuilderDsl of() {
        return new ProductVariantQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductVariantQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> prices(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prices"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> availability(
            Function<com.commercetools.api.predicates.query.product.ProductVariantAvailabilityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantAvailabilityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("availability"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductVariantAvailabilityQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductVariantQueryBuilderDsl> isMatchingVariant() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isMatchingVariant")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantQueryBuilderDsl> scopedPrice(
            Function<com.commercetools.api.predicates.query.common.ScopedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ScopedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("scopedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ScopedPriceQueryBuilderDsl.of())),
            ProductVariantQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductVariantQueryBuilderDsl> scopedPriceDiscounted() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scopedPriceDiscounted")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantQueryBuilderDsl::of));
    }
}
