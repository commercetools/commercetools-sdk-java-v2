
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

    /**
     *  <p>Unique identifier of the Product.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductProjectionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Product.</p>
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
     *  <p>User-defined unique identifier of the Product.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductProjectionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The ProductType defining the Attributes of the Product.</p>
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
     *  <p>The ProductType defining the Attributes of the Product.</p>
     * @param productType value to be set
     * @return Builder
     */

    public ProductProjectionBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductProjectionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductProjectionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductProjectionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductProjectionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in the Project.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductProjectionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in the Project.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductProjectionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductProjectionBuilder categories(
            final com.commercetools.api.models.category.CategoryReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductProjectionBuilder categories(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
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
     *  <p>Categories assigned to the Product.</p>
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
     *  <p>Categories assigned to the Product.</p>
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
     *  <p>Order of Product in Categories.</p>
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
     *  <p>Order of Product in Categories.</p>
     * @param categoryOrderHints value to be set
     * @return Builder
     */

    public ProductProjectionBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *  <p>Title of the Product displayed in search results.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductProjectionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Title of the Product displayed in search results.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductProjectionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Product displayed in search results below the meta title.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductProjectionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Product displayed in search results below the meta title.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductProjectionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductProjectionBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductProjectionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductProjectionBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
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
     *  <p><code>true</code> if the Product is published.</p>
     * @param published value to be set
     * @return Builder
     */

    public ProductProjectionBuilder published(@Nullable final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
     * @param builder function to build the masterVariant value
     * @return Builder
     */

    public ProductProjectionBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
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
     *  <p>The TaxCategory of the Product.</p>
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
     *  <p>The TaxCategory of the Product.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ProductProjectionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>State of the Product.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductProjectionBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Product.</p>
     * @param state value to be set
     * @return Builder
     */

    public ProductProjectionBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Review statistics of the Product.</p>
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
     *  <p>Review statistics of the Product.</p>
     * @param reviewRatingStatistics value to be set
     * @return Builder
     */

    public ProductProjectionBuilder reviewRatingStatistics(
            @Nullable final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
        return this;
    }

    /**
     *  <p>Indicates whether the Prices of the Product Projection are embedded or standalone. Projecting Prices only works with <code>Embedded</code>, there is currently no support for <code>Standalone</code>.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public ProductProjectionBuilder priceMode(
            @Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Unique identifier of the Product.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Product.</p>
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
     *  <p>User-defined unique identifier of the Product.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The ProductType defining the Attributes of the Product.</p>
     * @return productType
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
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
     *  <p>Description of the Product.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in the Project.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     * @return categories
     */

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Order of Product in Categories.</p>
     * @return categoryOrderHints
     */

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Title of the Product displayed in search results.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the Product displayed in search results below the meta title.</p>
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
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
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
     *  <p><code>true</code> if the Product is published.</p>
     * @return published
     */

    @Nullable
    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
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
     *  <p>The TaxCategory of the Product.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>State of the Product.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Review statistics of the Product.</p>
     * @return reviewRatingStatistics
     */

    @Nullable
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics() {
        return this.reviewRatingStatistics;
    }

    /**
     *  <p>Indicates whether the Prices of the Product Projection are embedded or standalone. Projecting Prices only works with <code>Embedded</code>, there is currently no support for <code>Standalone</code>.</p>
     * @return priceMode
     */

    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
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
        return new ProductProjectionImpl(id, version, createdAt, lastModifiedAt, key, productType, name, description,
            slug, categories, categoryOrderHints, metaTitle, metaDescription, metaKeywords, searchKeywords,
            hasStagedChanges, published, masterVariant, variants, taxCategory, state, reviewRatingStatistics,
            priceMode);
    }

    /**
     * builds ProductProjection without checking for non-null required values
     * @return ProductProjection
     */
    public ProductProjection buildUnchecked() {
        return new ProductProjectionImpl(id, version, createdAt, lastModifiedAt, key, productType, name, description,
            slug, categories, categoryOrderHints, metaTitle, metaDescription, metaKeywords, searchKeywords,
            hasStagedChanges, published, masterVariant, variants, taxCategory, state, reviewRatingStatistics,
            priceMode);
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
        return builder;
    }

}
