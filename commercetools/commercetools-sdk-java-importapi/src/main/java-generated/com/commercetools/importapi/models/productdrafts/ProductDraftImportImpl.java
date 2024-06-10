
package com.commercetools.importapi.models.productdrafts;

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
 *  <p>The representation of a Product Draft for the import purpose.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDraftImportImpl implements ProductDraftImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;

    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    private com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant;

    private java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;

    private com.commercetools.importapi.models.common.StateKeyReference state;

    private Boolean publish;

    private com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDraftImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("productType") final com.commercetools.importapi.models.common.ProductTypeKeyReference productType,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("categories") final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories,
            @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords,
            @JsonProperty("masterVariant") final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant,
            @JsonProperty("variants") final java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants,
            @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory,
            @JsonProperty("searchKeywords") final com.commercetools.importapi.models.products.SearchKeywords searchKeywords,
            @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("priceMode") final com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode) {
        this.key = key;
        this.productType = productType;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.categories = categories;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.masterVariant = masterVariant;
        this.variants = variants;
        this.taxCategory = taxCategory;
        this.searchKeywords = searchKeywords;
        this.state = state;
        this.publish = publish;
        this.priceMode = priceMode;
    }

    /**
     * create empty instance
     */
    public ProductDraftImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a Product with this <code>key</code> exists, it will be updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the ProductDraft is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType() {
        return this.productType;
    }

    /**
     *
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Maps to <code>Product.description</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>The Reference to the Categories with which the ProductDraft is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories() {
        return this.categories;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The master Product variant. Required if the <code>variants</code> array contains a Product Variant.</p>
     */

    public com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport getMasterVariant() {
        return this.masterVariant;
    }

    /**
     *  <p>An array of related Product Variants.</p>
     */

    public java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> getVariants() {
        return this.variants;
    }

    /**
     *  <p>The Reference to the TaxCategory with which the ProductDraft is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
     */

    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
     *  <pre><code>{
     *    "en": [
     *      { "text": "Multi tool" },
     *      { "text": "Swiss Army Knife", "suggestTokenizer": { "type": "whitespace" } }
     *    ],
     *    "de": [
     *      {
     *        "text": "Schweizer Messer",
     *        "suggestTokenizer": {
     *          "type": "custom",
     *          "inputs": ["schweizer messer", "offiziersmesser", "sackmesser"]
     *        }
     *      }
     *    ]
     *  }
     *  </code></pre>
     */

    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>The Reference to the State with which the ProductDraft is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>
     */

    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see Managing the published state of Products.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Determines the type of Prices the API uses. See ProductPriceMode for more details. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     */

    public com.commercetools.importapi.models.common.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setProductType(final com.commercetools.importapi.models.common.ProductTypeKeyReference productType) {
        this.productType = productType;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
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

    public void setMetaTitle(final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setMasterVariant(
            final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant) {
        this.masterVariant = masterVariant;
    }

    public void setVariants(
            final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(
            final java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants) {
        this.variants = variants;
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

        ProductDraftImportImpl that = (ProductDraftImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(productType, that.productType)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(categories, that.categories)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
                .append(taxCategory, that.taxCategory)
                .append(searchKeywords, that.searchKeywords)
                .append(state, that.state)
                .append(publish, that.publish)
                .append(priceMode, that.priceMode)
                .append(key, that.key)
                .append(productType, that.productType)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(categories, that.categories)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
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
                .append(productType)
                .append(name)
                .append(slug)
                .append(description)
                .append(categories)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(masterVariant)
                .append(variants)
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
                .append("productType", productType)
                .append("name", name)
                .append("slug", slug)
                .append("description", description)
                .append("categories", categories)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("masterVariant", masterVariant)
                .append("variants", variants)
                .append("taxCategory", taxCategory)
                .append("searchKeywords", searchKeywords)
                .append("state", state)
                .append("publish", publish)
                .append("priceMode", priceMode)
                .build();
    }

}
