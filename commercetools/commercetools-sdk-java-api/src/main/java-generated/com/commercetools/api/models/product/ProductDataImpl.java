
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
 *  <p>Contains all the data of a Product and its Product Variants.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDataImpl implements ProductData, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<com.commercetools.api.models.category.CategoryReference> categories;

    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private com.commercetools.api.models.product.ProductVariant masterVariant;

    private java.util.List<com.commercetools.api.models.product.ProductVariant> variants;

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDataImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("categories") final java.util.List<com.commercetools.api.models.category.CategoryReference> categories,
            @JsonProperty("categoryOrderHints") final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("masterVariant") final com.commercetools.api.models.product.ProductVariant masterVariant,
            @JsonProperty("variants") final java.util.List<com.commercetools.api.models.product.ProductVariant> variants,
            @JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.name = name;
        this.categories = categories;
        this.categoryOrderHints = categoryOrderHints;
        this.description = description;
        this.slug = slug;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.masterVariant = masterVariant;
        this.variants = variants;
        this.searchKeywords = searchKeywords;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public ProductDataImpl() {
    }

    /**
     *  <p>Name of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the Product.</p>
     */

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Numerical values to allow ordering of Products within a specified Category.</p>
     */

    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Description of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. Must be unique across a Project, but can be the same for Products in different <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a>. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Title of the Product as used by search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the Product as used by search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The Master Variant of the Product.</p>
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
     *  <p>Used by <span>Search Term Suggestions</span>, but is also considered for a <span>full text search</span> in the Product Projection Search API.</p>
     */

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>Product Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. <strong>Not supported</strong> by <span>Product Projection Search</span>.</p>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
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

    public void setMasterVariant(final com.commercetools.api.models.product.ProductVariant masterVariant) {
        this.masterVariant = masterVariant;
    }

    public void setVariants(final com.commercetools.api.models.product.ProductVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(final java.util.List<com.commercetools.api.models.product.ProductVariant> variants) {
        this.variants = variants;
    }

    public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
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

        ProductDataImpl that = (ProductDataImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(categories, that.categories)
                .append(categoryOrderHints, that.categoryOrderHints)
                .append(description, that.description)
                .append(slug, that.slug)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
                .append(searchKeywords, that.searchKeywords)
                .append(attributes, that.attributes)
                .append(name, that.name)
                .append(categories, that.categories)
                .append(categoryOrderHints, that.categoryOrderHints)
                .append(description, that.description)
                .append(slug, that.slug)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
                .append(searchKeywords, that.searchKeywords)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(categories)
                .append(categoryOrderHints)
                .append(description)
                .append(slug)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(masterVariant)
                .append(variants)
                .append(searchKeywords)
                .append(attributes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("categories", categories)
                .append("categoryOrderHints", categoryOrderHints)
                .append("description", description)
                .append("slug", slug)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("masterVariant", masterVariant)
                .append("variants", variants)
                .append("searchKeywords", searchKeywords)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public ProductData copyDeep() {
        return ProductData.deepCopy(this);
    }
}
