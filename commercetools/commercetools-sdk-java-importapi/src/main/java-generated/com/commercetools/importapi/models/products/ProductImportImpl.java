
package com.commercetools.importapi.models.products;

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
 *  <p>Represents the data used to import a Product. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in the Project.</p>
 *  <p>This is the minimal representation required for creating a Product in Composable Commerce.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductImportImpl implements ProductImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;

    private com.commercetools.importapi.models.common.StateKeyReference state;

    private Boolean publish;

    private com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("productType") final com.commercetools.importapi.models.common.ProductTypeKeyReference productType,
            @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("categories") final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes,
            @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords,
            @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory,
            @JsonProperty("searchKeywords") final com.commercetools.importapi.models.products.SearchKeywords searchKeywords,
            @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("priceMode") final com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode) {
        this.key = key;
        this.name = name;
        this.productType = productType;
        this.slug = slug;
        this.description = description;
        this.categories = categories;
        this.attributes = attributes;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.taxCategory = taxCategory;
        this.searchKeywords = searchKeywords;
        this.state = state;
        this.publish = publish;
        this.priceMode = priceMode;
    }

    /**
     * create empty instance
     */
    public ProductImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> do not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories() {
        return this.categories;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     */

    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     */

    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     */

    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see <span>Managing the published state of Products</span>.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Maps to <code>Product.priceMode</code>.</p>
     */

    public com.commercetools.importapi.models.common.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductType(final com.commercetools.importapi.models.common.ProductTypeKeyReference productType) {
        this.productType = productType;
    }

    public void setSlug(final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setCategories(final com.commercetools.importapi.models.common.CategoryKeyReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
    }

    public void setCategories(
            final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories) {
        this.categories = categories;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setMetaTitle(final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setSearchKeywords(final com.commercetools.importapi.models.products.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public void setState(final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setPriceMode(final com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductImportImpl that = (ProductImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(productType, that.productType)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(categories, that.categories)
                .append(attributes, that.attributes)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(taxCategory, that.taxCategory)
                .append(searchKeywords, that.searchKeywords)
                .append(state, that.state)
                .append(publish, that.publish)
                .append(priceMode, that.priceMode)
                .append(key, that.key)
                .append(name, that.name)
                .append(productType, that.productType)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(categories, that.categories)
                .append(attributes, that.attributes)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(taxCategory, that.taxCategory)
                .append(searchKeywords, that.searchKeywords)
                .append(state, that.state)
                .append(publish, that.publish)
                .append(priceMode, that.priceMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(productType)
                .append(slug)
                .append(description)
                .append(categories)
                .append(attributes)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(taxCategory)
                .append(searchKeywords)
                .append(state)
                .append(publish)
                .append(priceMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("productType", productType)
                .append("slug", slug)
                .append("description", description)
                .append("categories", categories)
                .append("attributes", attributes)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("taxCategory", taxCategory)
                .append("searchKeywords", searchKeywords)
                .append("state", state)
                .append("publish", publish)
                .append("priceMode", priceMode)
                .build();
    }

    @Override
    public ProductImport copyDeep() {
        return ProductImport.deepCopy(this);
    }
}
