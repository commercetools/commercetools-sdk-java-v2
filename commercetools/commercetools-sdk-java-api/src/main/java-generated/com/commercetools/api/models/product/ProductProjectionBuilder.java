
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductProjectionBuilder implements Builder<ProductProjection> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String key;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString slug;

    private java.util.List<com.commercetools.api.models.category.CategoryReference> categories;

    @Nullable
    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    @Nullable
    private Boolean hasStagedChanges;

    @Nullable
    private Boolean published;

    private com.commercetools.api.models.product.ProductVariant masterVariant;

    private java.util.List<com.commercetools.api.models.product.ProductVariant> variants;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;

    public ProductProjectionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductProjectionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProductProjectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ProductProjectionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ProductProjectionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductProjectionBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    public ProductProjectionBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    public ProductProjectionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductProjectionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ProductProjectionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductProjectionBuilder categories(
            final com.commercetools.api.models.category.CategoryReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    public ProductProjectionBuilder categories(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> categories) {
        this.categories = categories;
        return this;
    }

    public ProductProjectionBuilder plusCategories(
            final com.commercetools.api.models.category.CategoryReference... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    public ProductProjectionBuilder plusCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    public ProductProjectionBuilder withCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    public ProductProjectionBuilder categoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHintsBuilder> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    public ProductProjectionBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    public ProductProjectionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public ProductProjectionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    public ProductProjectionBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    public ProductProjectionBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder searchKeywords(
            @Nullable final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    public ProductProjectionBuilder hasStagedChanges(@Nullable final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
        return this;
    }

    public ProductProjectionBuilder published(@Nullable final Boolean published) {
        this.published = published;
        return this;
    }

    public ProductProjectionBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder masterVariant(
            final com.commercetools.api.models.product.ProductVariant masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    public ProductProjectionBuilder variants(final com.commercetools.api.models.product.ProductVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    public ProductProjectionBuilder variants(
            final java.util.List<com.commercetools.api.models.product.ProductVariant> variants) {
        this.variants = variants;
        return this;
    }

    public ProductProjectionBuilder plusVariants(
            final com.commercetools.api.models.product.ProductVariant... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    public ProductProjectionBuilder plusVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    public ProductProjectionBuilder withVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    public ProductProjectionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    public ProductProjectionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ProductProjectionBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public ProductProjectionBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public ProductProjectionBuilder reviewRatingStatistics(
            Function<com.commercetools.api.models.review.ReviewRatingStatisticsBuilder, com.commercetools.api.models.review.ReviewRatingStatisticsBuilder> builder) {
        this.reviewRatingStatistics = builder
                .apply(com.commercetools.api.models.review.ReviewRatingStatisticsBuilder.of())
                .build();
        return this;
    }

    public ProductProjectionBuilder reviewRatingStatistics(
            @Nullable final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    @Nullable
    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    @Nullable
    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    @Nullable
    public Boolean getPublished() {
        return this.published;
    }

    public com.commercetools.api.models.product.ProductVariant getMasterVariant() {
        return this.masterVariant;
    }

    public java.util.List<com.commercetools.api.models.product.ProductVariant> getVariants() {
        return this.variants;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics() {
        return this.reviewRatingStatistics;
    }

    public ProductProjection build() {
        Objects.requireNonNull(id, ProductProjection.class + ": id is missing");
        Objects.requireNonNull(version, ProductProjection.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductProjection.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductProjection.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(productType, ProductProjection.class + ": productType is missing");
        Objects.requireNonNull(name, ProductProjection.class + ": name is missing");
        Objects.requireNonNull(slug, ProductProjection.class + ": slug is missing");
        Objects.requireNonNull(categories, ProductProjection.class + ": categories is missing");
        Objects.requireNonNull(masterVariant, ProductProjection.class + ": masterVariant is missing");
        Objects.requireNonNull(variants, ProductProjection.class + ": variants is missing");
        return new ProductProjectionImpl(id, version, createdAt, lastModifiedAt, key, productType, name, description,
            slug, categories, categoryOrderHints, metaTitle, metaDescription, metaKeywords, searchKeywords,
            hasStagedChanges, published, masterVariant, variants, taxCategory, state, reviewRatingStatistics);
    }

    /**
     * builds ProductProjection without checking for non null required values
     */
    public ProductProjection buildUnchecked() {
        return new ProductProjectionImpl(id, version, createdAt, lastModifiedAt, key, productType, name, description,
            slug, categories, categoryOrderHints, metaTitle, metaDescription, metaKeywords, searchKeywords,
            hasStagedChanges, published, masterVariant, variants, taxCategory, state, reviewRatingStatistics);
    }

    public static ProductProjectionBuilder of() {
        return new ProductProjectionBuilder();
    }

    public static ProductProjectionBuilder of(final ProductProjection template) {
        ProductProjectionBuilder builder = new ProductProjectionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.productType = template.getProductType();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.slug = template.getSlug();
        builder.categories = template.getCategories();
        builder.categoryOrderHints = template.getCategoryOrderHints();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.searchKeywords = template.getSearchKeywords();
        builder.hasStagedChanges = template.getHasStagedChanges();
        builder.published = template.getPublished();
        builder.masterVariant = template.getMasterVariant();
        builder.variants = template.getVariants();
        builder.taxCategory = template.getTaxCategory();
        builder.state = template.getState();
        builder.reviewRatingStatistics = template.getReviewRatingStatistics();
        return builder;
    }

}
