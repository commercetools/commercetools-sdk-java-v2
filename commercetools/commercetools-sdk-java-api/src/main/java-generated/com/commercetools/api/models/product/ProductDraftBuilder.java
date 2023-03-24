
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraft productDraft = ProductDraft.builder()
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDraftBuilder implements Builder<ProductDraft> {

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

    @Nullable
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    /**
     *  <p>The Product Type defining the Attributes for the Product. Cannot be changed later.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ProductDraftBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder, com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder> builder) {
        this.productType = builder
                .apply(com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Product Type defining the Attributes for the Product. Cannot be changed later.</p>
     * @param productType value to be set
     * @return Builder
     */

    public ProductDraftBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different Locales. It must match the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductDraftBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different Locales. It must match the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductDraftBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductDraftBuilder categories(
            @Nullable final com.commercetools.api.models.category.CategoryResourceIdentifier... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductDraftBuilder categories(
            @Nullable final java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductDraftBuilder plusCategories(
            @Nullable final com.commercetools.api.models.category.CategoryResourceIdentifier... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDraftBuilder plusCategories(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(
            builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDraftBuilder withCategories(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories.add(
            builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @param builder function to build the categoryOrderHints value
     * @return Builder
     */

    public ProductDraftBuilder categoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHintsBuilder> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     * @param categoryOrderHints value to be set
     * @return Builder
     */

    public ProductDraftBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *  <p>Title of the Product displayed in search results.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductDraftBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Title of the Product displayed in search results.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductDraftBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Product displayed in search results.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductDraftBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product displayed in search results.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductDraftBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductDraftBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductDraftBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>The Product Variant to be the Master Variant for the Product. Required if <code>variants</code> are provided also.</p>
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductDraftBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraftBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Product Variant to be the Master Variant for the Product. Required if <code>variants</code> are provided also.</p>
     * @param masterVariant value to be set
     * @return Builder
     */

    public ProductDraftBuilder masterVariant(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductDraftBuilder variants(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductDraftBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductDraftBuilder plusVariants(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDraftBuilder plusVariants(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraftBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDraftBuilder withVariants(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraftBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Tax Category to be assigned to the Product.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Tax Category to be assigned to the Product.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ProductDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductDraftBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @param searchKeywords value to be set
     * @return Builder
     */

    public ProductDraftBuilder searchKeywords(
            @Nullable final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *  <p>State to be assigned to the Product.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State to be assigned to the Product.</p>
     * @param state value to be set
     * @return Builder
     */

    public ProductDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the Product is published immediately to the current projection.</p>
     * @param publish value to be set
     * @return Builder
     */

    public ProductDraftBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Specifies the type of prices used when looking up a price for the Product.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public ProductDraftBuilder priceMode(
            @Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
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

    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    /**
     * builds ProductDraft with checking for non-null required values
     * @return ProductDraft
     */
    public ProductDraft build() {
        Objects.requireNonNull(productType, ProductDraft.class + ": productType is missing");
        Objects.requireNonNull(name, ProductDraft.class + ": name is missing");
        Objects.requireNonNull(slug, ProductDraft.class + ": slug is missing");
        return new ProductDraftImpl(productType, name, slug, key, description, categories, categoryOrderHints,
            metaTitle, metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state,
            publish, priceMode);
    }

    /**
     * builds ProductDraft without checking for non-null required values
     * @return ProductDraft
     */
    public ProductDraft buildUnchecked() {
        return new ProductDraftImpl(productType, name, slug, key, description, categories, categoryOrderHints,
            metaTitle, metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state,
            publish, priceMode);
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
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
