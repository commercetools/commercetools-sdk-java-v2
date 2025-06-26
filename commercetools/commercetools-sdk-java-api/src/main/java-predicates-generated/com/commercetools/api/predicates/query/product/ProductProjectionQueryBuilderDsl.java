
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductProjectionQueryBuilderDsl {
    public ProductProjectionQueryBuilderDsl() {
    }

    public static ProductProjectionQueryBuilderDsl of() {
        return new ProductProjectionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> productType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productType"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> categories(
            Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("categories"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductProjectionQueryBuilderDsl> categories() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("categories")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> categoryOrderHints(
            Function<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("categoryOrderHints"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> metaTitle(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaTitle"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> metaDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> searchKeywords(
            Function<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("searchKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> hasStagedChanges() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("hasStagedChanges")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> published() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("published")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> masterVariant(
            Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("masterVariant"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> variants(
            Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variants"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductProjectionQueryBuilderDsl> variants() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variants")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> reviewRatingStatistics(
            Function<com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("reviewRatingStatistics"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductProjectionQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductProjectionQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            ProductProjectionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductProjectionQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductProjectionQueryBuilderDsl::of));
    }

}
