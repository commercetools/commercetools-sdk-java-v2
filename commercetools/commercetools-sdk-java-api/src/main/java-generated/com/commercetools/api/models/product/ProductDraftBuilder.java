
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
     * @param builder function to build the productType value
     * @return Builder
     */

    public ProductDraftBuilder withProductType(
            Function<com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder, com.commercetools.api.models.product_type.ProductTypeResourceIdentifier> builder) {
        this.productType = builder
                .apply(com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of());
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
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
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
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductDraftBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
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
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing Products with the Import API and the Merchant Center.</p>
     *  <p>To update a Product using the Import API or Merchant Center, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
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
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
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
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDraftBuilder addCategories(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifier> builder) {
        return plusCategories(
            builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductDraftBuilder setCategories(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifier> builder) {
        return categories(builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Numerical values to allow ordering of Products within specified Categories. If the referenced Categories are not also assigned in the <code>categories</code> field, an InvalidOperation error is returned.</p>
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
     *  <p>Numerical values to allow ordering of Products within specified Categories. If the referenced Categories are not also assigned in the <code>categories</code> field, an InvalidOperation error is returned.</p>
     * @param builder function to build the categoryOrderHints value
     * @return Builder
     */

    public ProductDraftBuilder withCategoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHints> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of());
        return this;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within specified Categories. If the referenced Categories are not also assigned in the <code>categories</code> field, an InvalidOperation error is returned.</p>
     * @param categoryOrderHints value to be set
     * @return Builder
     */

    public ProductDraftBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductDraftBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductDraftBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductDraftBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductDraftBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductDraftBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
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
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductDraftBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
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
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductDraftBuilder withMasterVariant(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraft> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of());
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
     *  <p>The additional Product Variants for the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDraftBuilder addVariants(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraft> builder) {
        return plusVariants(builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of()));
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductDraftBuilder setVariants(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraft> builder) {
        return variants(builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of()));
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
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductDraftBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
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
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductDraftBuilder withSearchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywords> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of());
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
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
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

    /**
     *  <p>The Product Type defining the Attributes for the Product. Cannot be changed later.</p>
     * @return productType
     */

    public com.commercetools.api.models.product_type.ProductTypeResourceIdentifier getProductType() {
        return this.productType;
    }

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different Locales. It must match the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing Products with the Import API and the Merchant Center.</p>
     *  <p>To update a Product using the Import API or Merchant Center, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the Product.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @return categories
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within specified Categories. If the referenced Categories are not also assigned in the <code>categories</code> field, an InvalidOperation error is returned.</p>
     * @return categoryOrderHints
     */

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The Product Variant to be the Master Variant for the Product. Required if <code>variants</code> are provided also.</p>
     * @return masterVariant
     */

    @Nullable
    public com.commercetools.api.models.product.ProductVariantDraft getMasterVariant() {
        return this.masterVariant;
    }

    /**
     *  <p>The additional Product Variants for the Product.</p>
     * @return variants
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product.ProductVariantDraft> getVariants() {
        return this.variants;
    }

    /**
     *  <p>The Tax Category to be assigned to the Product.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @return searchKeywords
     */

    @Nullable
    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>State to be assigned to the Product.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>If <code>true</code>, the Product is published immediately to the current projection.</p>
     * @return publish
     */

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Specifies the type of prices used when looking up a price for the Product.</p>
     * @return priceMode
     */

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

    /**
     * factory method for an instance of ProductDraftBuilder
     * @return builder
     */
    public static ProductDraftBuilder of() {
        return new ProductDraftBuilder();
    }

    /**
     * create builder for ProductDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
