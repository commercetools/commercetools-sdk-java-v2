
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProductProjection
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductProjectionImpl implements ProductProjection, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString slug;

    private java.util.List<com.commercetools.api.models.category.CategoryReference> categories;

    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    private Boolean hasStagedChanges;

    private Boolean published;

    private com.commercetools.api.models.product.ProductVariant masterVariant;

    private java.util.List<com.commercetools.api.models.product.ProductVariant> variants;

    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;

    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductProjectionImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("categories") final java.util.List<com.commercetools.api.models.category.CategoryReference> categories,
            @JsonProperty("categoryOrderHints") final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints,
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords,
            @JsonProperty("hasStagedChanges") final Boolean hasStagedChanges,
            @JsonProperty("published") final Boolean published,
            @JsonProperty("masterVariant") final com.commercetools.api.models.product.ProductVariant masterVariant,
            @JsonProperty("variants") final java.util.List<com.commercetools.api.models.product.ProductVariant> variants,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("reviewRatingStatistics") final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics,
            @JsonProperty("priceMode") final com.commercetools.api.models.product.ProductPriceModeEnum priceMode,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.productType = productType;
        this.name = name;
        this.description = description;
        this.slug = slug;
        this.categories = categories;
        this.categoryOrderHints = categoryOrderHints;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.searchKeywords = searchKeywords;
        this.hasStagedChanges = hasStagedChanges;
        this.published = published;
        this.masterVariant = masterVariant;
        this.variants = variants;
        this.taxCategory = taxCategory;
        this.state = state;
        this.reviewRatingStatistics = reviewRatingStatistics;
        this.priceMode = priceMode;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public ProductProjectionImpl() {
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the ProductProjection was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ProductProjection was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> defining the Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. Must be unique across a Project, but can be the same for Products in different locales. Matches the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Order of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     */

    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Title of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> displayed in search results below the meta title.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords that give additional information about the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> to search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Used by <span>Search Term Suggestions</span>, but is also considered for a <span>full text search</span> in the Product Projection Search API.</p>
     */

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p><code>true</code> if the staged data is different from the current data.</p>
     */

    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    /**
     *  <p><code>true</code> if the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrentStaged" rel="nofollow">published</a>.</p>
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     *  <p>The Master Variant of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.product.ProductVariant getMasterVariant() {
        return this.masterVariant;
    }

    /**
     *  <p>Additional Product Variants.</p>
     */

    public java.util.List<com.commercetools.api.models.product.ProductVariant> getVariants() {
        return this.variants;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Review statistics of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics() {
        return this.reviewRatingStatistics;
    }

    /**
     *  <p>Indicates whether the Prices of the Product Projection are <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">embedded</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">standalone</a>. <span>Projecting Prices</span> only works with <code>Embedded</code>, there is currently no support for <code>Standalone</code>.</p>
     */

    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinitionDraft" rel="nofollow">AttributeDefinition</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setCategories(final com.commercetools.api.models.category.CategoryReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
    }

    public void setCategories(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> categories) {
        this.categories = categories;
    }

    public void setCategoryOrderHints(
            final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public void setHasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
    }

    public void setPublished(final Boolean published) {
        this.published = published;
    }

    public void setMasterVariant(final com.commercetools.api.models.product.ProductVariant masterVariant) {
        this.masterVariant = masterVariant;
    }

    public void setVariants(final com.commercetools.api.models.product.ProductVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(final java.util.List<com.commercetools.api.models.product.ProductVariant> variants) {
        this.variants = variants;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setReviewRatingStatistics(
            final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
    }

    public void setPriceMode(final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductProjectionImpl that = (ProductProjectionImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(productType, that.productType)
                .append(name, that.name)
                .append(description, that.description)
                .append(slug, that.slug)
                .append(categories, that.categories)
                .append(categoryOrderHints, that.categoryOrderHints)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(searchKeywords, that.searchKeywords)
                .append(hasStagedChanges, that.hasStagedChanges)
                .append(published, that.published)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
                .append(taxCategory, that.taxCategory)
                .append(state, that.state)
                .append(reviewRatingStatistics, that.reviewRatingStatistics)
                .append(priceMode, that.priceMode)
                .append(attributes, that.attributes)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(productType, that.productType)
                .append(name, that.name)
                .append(description, that.description)
                .append(slug, that.slug)
                .append(categories, that.categories)
                .append(categoryOrderHints, that.categoryOrderHints)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(searchKeywords, that.searchKeywords)
                .append(hasStagedChanges, that.hasStagedChanges)
                .append(published, that.published)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
                .append(taxCategory, that.taxCategory)
                .append(state, that.state)
                .append(reviewRatingStatistics, that.reviewRatingStatistics)
                .append(priceMode, that.priceMode)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(key)
                .append(productType)
                .append(name)
                .append(description)
                .append(slug)
                .append(categories)
                .append(categoryOrderHints)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(searchKeywords)
                .append(hasStagedChanges)
                .append(published)
                .append(masterVariant)
                .append(variants)
                .append(taxCategory)
                .append(state)
                .append(reviewRatingStatistics)
                .append(priceMode)
                .append(attributes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("key", key)
                .append("productType", productType)
                .append("name", name)
                .append("description", description)
                .append("slug", slug)
                .append("categories", categories)
                .append("categoryOrderHints", categoryOrderHints)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("searchKeywords", searchKeywords)
                .append("hasStagedChanges", hasStagedChanges)
                .append("published", published)
                .append("masterVariant", masterVariant)
                .append("variants", variants)
                .append("taxCategory", taxCategory)
                .append("state", state)
                .append("reviewRatingStatistics", reviewRatingStatistics)
                .append("priceMode", priceMode)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public ProductProjection copyDeep() {
        return ProductProjection.deepCopy(this);
    }
}
