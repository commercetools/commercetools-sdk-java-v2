
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantProjectionQueryBuilderDsl {
    public VariantProjectionQueryBuilderDsl() {
    }

    public static VariantProjectionQueryBuilderDsl of() {
        return new VariantProjectionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> categories(
            Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("categories"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantProjectionQueryBuilderDsl> categories() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("categories")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> categoryOrderHints(
            Function<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("categoryOrderHints"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantProjectionQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantProjectionQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantProjectionQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            VariantProjectionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<VariantProjectionQueryBuilderDsl> _default() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("default")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionQueryBuilderDsl::of));
    }

}
