
package com.commercetools.importapi.models.productdrafts;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDraftImportBuilder implements Builder<ProductDraftImport> {

    private String key;

    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants;

    @Nullable
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    @Nullable
    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;

    @Nullable
    private com.commercetools.importapi.models.common.StateKeyReference state;

    @Nullable
    private Boolean publish;

    public ProductDraftImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ProductDraftImportBuilder productType(
            Function<com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public ProductDraftImportBuilder productType(
            final com.commercetools.importapi.models.common.ProductTypeKeyReference productType) {
        this.productType = productType;
        return this;
    }

    public ProductDraftImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDraftImportBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductDraftImportBuilder slug(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDraftImportBuilder slug(final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductDraftImportBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDraftImportBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ProductDraftImportBuilder categories(
            @Nullable final com.commercetools.importapi.models.common.CategoryKeyReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    public ProductDraftImportBuilder categories(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories) {
        this.categories = categories;
        return this;
    }

    public ProductDraftImportBuilder plusCategories(
            @Nullable final com.commercetools.importapi.models.common.CategoryKeyReference... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    public ProductDraftImportBuilder plusCategories(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories
                .add(builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()).build());
        return this;
    }

    public ProductDraftImportBuilder withCategories(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories
                .add(builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()).build());
        return this;
    }

    public ProductDraftImportBuilder metaTitle(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductDraftImportBuilder metaTitle(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public ProductDraftImportBuilder metaDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public ProductDraftImportBuilder metaDescription(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    public ProductDraftImportBuilder metaKeywords(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public ProductDraftImportBuilder metaKeywords(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    public ProductDraftImportBuilder masterVariant(
            Function<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder> builder) {
        this.masterVariant = builder
                .apply(com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder.of())
                .build();
        return this;
    }

    public ProductDraftImportBuilder masterVariant(
            @Nullable final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    public ProductDraftImportBuilder variants(
            @Nullable final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    public ProductDraftImportBuilder variants(
            @Nullable final java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants) {
        this.variants = variants;
        return this;
    }

    public ProductDraftImportBuilder plusVariants(
            @Nullable final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    public ProductDraftImportBuilder plusVariants(
            Function<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder.of())
                    .build());
        return this;
    }

    public ProductDraftImportBuilder withVariants(
            Function<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportBuilder.of())
                    .build());
        return this;
    }

    public ProductDraftImportBuilder taxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public ProductDraftImportBuilder taxCategory(
            @Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ProductDraftImportBuilder searchKeywords(
            Function<com.commercetools.importapi.models.products.SearchKeywordsBuilder, com.commercetools.importapi.models.products.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.importapi.models.products.SearchKeywordsBuilder.of())
                .build();
        return this;
    }

    public ProductDraftImportBuilder searchKeywords(
            @Nullable final com.commercetools.importapi.models.products.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    public ProductDraftImportBuilder state(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of()).build();
        return this;
    }

    public ProductDraftImportBuilder state(
            @Nullable final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }

    public ProductDraftImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType() {
        return this.productType;
    }

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories() {
        return this.categories;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    @Nullable
    public com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport getMasterVariant() {
        return this.masterVariant;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> getVariants() {
        return this.variants;
    }

    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    @Nullable
    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    public ProductDraftImport build() {
        Objects.requireNonNull(key, ProductDraftImport.class + ": key is missing");
        Objects.requireNonNull(productType, ProductDraftImport.class + ": productType is missing");
        Objects.requireNonNull(name, ProductDraftImport.class + ": name is missing");
        Objects.requireNonNull(slug, ProductDraftImport.class + ": slug is missing");
        return new ProductDraftImportImpl(key, productType, name, slug, description, categories, metaTitle,
            metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state, publish);
    }

    /**
     * builds ProductDraftImport without checking for non null required values
     */
    public ProductDraftImport buildUnchecked() {
        return new ProductDraftImportImpl(key, productType, name, slug, description, categories, metaTitle,
            metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state, publish);
    }

    public static ProductDraftImportBuilder of() {
        return new ProductDraftImportBuilder();
    }

    public static ProductDraftImportBuilder of(final ProductDraftImport template) {
        ProductDraftImportBuilder builder = new ProductDraftImportBuilder();
        builder.key = template.getKey();
        builder.productType = template.getProductType();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.categories = template.getCategories();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.masterVariant = template.getMasterVariant();
        builder.variants = template.getVariants();
        builder.taxCategory = template.getTaxCategory();
        builder.searchKeywords = template.getSearchKeywords();
        builder.state = template.getState();
        builder.publish = template.getPublish();
        return builder;
    }

}
