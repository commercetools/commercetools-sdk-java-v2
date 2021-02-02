
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDraftBuilder {

    private com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories;

    @Nullable
    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.api.models.product.ProductVariantDraft masterVariant;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean publish;

    public ProductDraftBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType) {
        this.productType = productType;
        return this;
    }

    public ProductDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ProductDraftBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public ProductDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public ProductDraftBuilder categories(
            @Nullable final com.commercetools.api.models.category.CategoryResourceIdentifier... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    public ProductDraftBuilder categories(
            @Nullable final java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories) {
        this.categories = categories;
        return this;
    }

    public ProductDraftBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    public ProductDraftBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public ProductDraftBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    public ProductDraftBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    public ProductDraftBuilder masterVariant(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    public ProductDraftBuilder variants(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    public ProductDraftBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants) {
        this.variants = variants;
        return this;
    }

    public ProductDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public ProductDraftBuilder searchKeywords(
            @Nullable final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    public ProductDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public ProductDraftBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    public com.commercetools.api.models.product_type.ProductTypeResourceIdentifier getProductType() {
        return this.productType;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> getCategories() {
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
    public com.commercetools.api.models.product.ProductVariantDraft getMasterVariant() {
        return this.masterVariant;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product.ProductVariantDraft> getVariants() {
        return this.variants;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    public ProductDraft build() {
        return new ProductDraftImpl(productType, name, slug, key, description, categories, categoryOrderHints,
            metaTitle, metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state,
            publish);
    }

    public static ProductDraftBuilder of() {
        return new ProductDraftBuilder();
    }

    public static ProductDraftBuilder of(final ProductDraft template) {
        ProductDraftBuilder builder = new ProductDraftBuilder();
        builder.productType = template.getProductType();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.categories = template.getCategories();
        builder.categoryOrderHints = template.getCategoryOrderHints();
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
