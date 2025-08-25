
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductProjectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjection productProjection = ProductProjection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .plusCategories(categoriesBuilder -> categoriesBuilder)
 *             .masterVariant(masterVariantBuilder -> masterVariantBuilder)
 *             .plusVariants(variantsBuilder -> variantsBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    @Nullable
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductProjectionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductProjectionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductProjection was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductProjectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductProjection was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductProjectionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductProjectionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ProductProjectionBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ProductProjectionBuilder withProductType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReference> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productType value to be set
     * @return Builder
     */

    public ProductProjectionBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductProjectionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductProjectionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductProjectionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductProjectionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductProjectionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductProjectionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductProjectionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductProjectionBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductProjectionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductProjectionBuilder categories(
            final com.commercetools.api.models.category.CategoryReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductProjectionBuilder categories(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductProjectionBuilder plusCategories(
            final com.commercetools.api.models.category.CategoryReference... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductProjectionBuilder plusCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductProjectionBuilder withCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductProjectionBuilder addCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        return plusCategories(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductProjectionBuilder setCategories(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        return categories(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()));
    }

    /**
     *  <p>Order of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     * @param builder function to build the categoryOrderHints value
     * @return Builder
     */

    public ProductProjectionBuilder categoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHintsBuilder> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Order of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     * @param builder function to build the categoryOrderHints value
     * @return Builder
     */

    public ProductProjectionBuilder withCategoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHints> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of());
        return this;
    }

    /**
     *  <p>Order of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     * @param categoryOrderHints value to be set
     * @return Builder
     */

    public ProductProjectionBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *  <p>Title of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductProjectionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Title of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductProjectionBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Title of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductProjectionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results below the meta title.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductProjectionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results below the meta title.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductProjectionBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results below the meta title.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductProjectionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> to search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductProjectionBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> to search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductProjectionBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> to search engines.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductProjectionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Used by <span>Search Term Suggestions</span>, but is also considered for a <span>full text search</span> in the Product Projection Search API.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductProjectionBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used by <span>Search Term Suggestions</span>, but is also considered for a <span>full text search</span> in the Product Projection Search API.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductProjectionBuilder withSearchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywords> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of());
        return this;
    }

    /**
     *  <p>Used by <span>Search Term Suggestions</span>, but is also considered for a <span>full text search</span> in the Product Projection Search API.</p>
     * @param searchKeywords value to be set
     * @return Builder
     */

    public ProductProjectionBuilder searchKeywords(
            @Nullable final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *  <p><code>true</code> if the staged data is different from the current data.</p>
     * @param hasStagedChanges value to be set
     * @return Builder
     */

    public ProductProjectionBuilder hasStagedChanges(@Nullable final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
        return this;
    }

    /**
     *  <p><code>true</code> if the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">published</a>.</p>
     * @param published value to be set
     * @return Builder
     */

    public ProductProjectionBuilder published(@Nullable final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>The Master Variant of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductProjectionBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Master Variant of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductProjectionBuilder withMasterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of());
        return this;
    }

    /**
     *  <p>The Master Variant of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param masterVariant value to be set
     * @return Builder
     */

    public ProductProjectionBuilder masterVariant(
            final com.commercetools.api.models.product.ProductVariant masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductProjectionBuilder variants(final com.commercetools.api.models.product.ProductVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductProjectionBuilder variants(
            final java.util.List<com.commercetools.api.models.product.ProductVariant> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductProjectionBuilder plusVariants(
            final com.commercetools.api.models.product.ProductVariant... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductProjectionBuilder plusVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductProjectionBuilder withVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductProjectionBuilder addVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        return plusVariants(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()));
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductProjectionBuilder setVariants(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        return variants(builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()));
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductProjectionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductProjectionBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder, com.commercetools.api.models.tax_category.TaxCategoryReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ProductProjectionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductProjectionBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductProjectionBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public ProductProjectionBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Review statistics of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the reviewRatingStatistics value
     * @return Builder
     */

    public ProductProjectionBuilder reviewRatingStatistics(
            Function<com.commercetools.api.models.review.ReviewRatingStatisticsBuilder, com.commercetools.api.models.review.ReviewRatingStatisticsBuilder> builder) {
        this.reviewRatingStatistics = builder
                .apply(com.commercetools.api.models.review.ReviewRatingStatisticsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Review statistics of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the reviewRatingStatistics value
     * @return Builder
     */

    public ProductProjectionBuilder withReviewRatingStatistics(
            Function<com.commercetools.api.models.review.ReviewRatingStatisticsBuilder, com.commercetools.api.models.review.ReviewRatingStatistics> builder) {
        this.reviewRatingStatistics = builder
                .apply(com.commercetools.api.models.review.ReviewRatingStatisticsBuilder.of());
        return this;
    }

    /**
     *  <p>Review statistics of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param reviewRatingStatistics value to be set
     * @return Builder
     */

    public ProductProjectionBuilder reviewRatingStatistics(
            @Nullable final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
        return this;
    }

    /**
     *  <p>Indicates whether the Prices of the Product Projection are <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">embedded</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">standalone</a>. <span>Projecting Prices</span> only works with <code>Embedded</code>, there is currently no support for <code>Standalone</code>.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public ProductProjectionBuilder priceMode(
            @Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductProjectionBuilder attributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductProjectionBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductProjectionBuilder plusAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductProjectionBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductProjectionBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductProjectionBuilder addAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductProjectionBuilder setAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.Attribute> builder) {
        return attributes(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ProductProjection was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ProductProjection was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productType
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return categories
     */

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Order of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     * @return categoryOrderHints
     */

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Title of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results below the meta title.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords that give additional information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> to search engines.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Used by <span>Search Term Suggestions</span>, but is also considered for a <span>full text search</span> in the Product Projection Search API.</p>
     * @return searchKeywords
     */

    @Nullable
    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p><code>true</code> if the staged data is different from the current data.</p>
     * @return hasStagedChanges
     */

    @Nullable
    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    /**
     *  <p><code>true</code> if the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">published</a>.</p>
     * @return published
     */

    @Nullable
    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>The Master Variant of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return masterVariant
     */

    public com.commercetools.api.models.product.ProductVariant getMasterVariant() {
        return this.masterVariant;
    }

    /**
     *  <p>Additional Product Variants.</p>
     * @return variants
     */

    public java.util.List<com.commercetools.api.models.product.ProductVariant> getVariants() {
        return this.variants;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Review statistics of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return reviewRatingStatistics
     */

    @Nullable
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics() {
        return this.reviewRatingStatistics;
    }

    /**
     *  <p>Indicates whether the Prices of the Product Projection are <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">embedded</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">standalone</a>. <span>Projecting Prices</span> only works with <code>Embedded</code>, there is currently no support for <code>Standalone</code>.</p>
     * @return priceMode
     */

    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds ProductProjection with checking for non-null required values
     * @return ProductProjection
     */
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
        Objects.requireNonNull(attributes, ProductProjection.class + ": attributes is missing");
        return new ProductProjectionImpl(id, version, createdAt, lastModifiedAt, key, productType, name, description,
            slug, categories, categoryOrderHints, metaTitle, metaDescription, metaKeywords, searchKeywords,
            hasStagedChanges, published, masterVariant, variants, taxCategory, state, reviewRatingStatistics, priceMode,
            attributes);
    }

    /**
     * builds ProductProjection without checking for non-null required values
     * @return ProductProjection
     */
    public ProductProjection buildUnchecked() {
        return new ProductProjectionImpl(id, version, createdAt, lastModifiedAt, key, productType, name, description,
            slug, categories, categoryOrderHints, metaTitle, metaDescription, metaKeywords, searchKeywords,
            hasStagedChanges, published, masterVariant, variants, taxCategory, state, reviewRatingStatistics, priceMode,
            attributes);
    }

    /**
     * factory method for an instance of ProductProjectionBuilder
     * @return builder
     */
    public static ProductProjectionBuilder of() {
        return new ProductProjectionBuilder();
    }

    /**
     * create builder for ProductProjection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.priceMode = template.getPriceMode();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
