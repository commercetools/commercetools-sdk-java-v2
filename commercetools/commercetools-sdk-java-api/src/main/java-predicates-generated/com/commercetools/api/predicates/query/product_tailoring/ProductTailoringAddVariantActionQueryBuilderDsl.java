
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringAddVariantActionQueryBuilderDsl {
    public ProductTailoringAddVariantActionQueryBuilderDsl() {
    }

    public static ProductTailoringAddVariantActionQueryBuilderDsl of() {
        return new ProductTailoringAddVariantActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringAddVariantActionQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductTailoringAddVariantActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringAddVariantActionQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            ProductTailoringAddVariantActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringAddVariantActionQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("attributes"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAttributeQueryBuilderDsl
                            .of())),
            ProductTailoringAddVariantActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringAddVariantActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddVariantActionQueryBuilderDsl::of));
    }

}
