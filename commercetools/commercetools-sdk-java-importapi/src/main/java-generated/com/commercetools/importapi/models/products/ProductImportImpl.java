
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The data representation for a Product to be imported that is persisted as a <a href="/../api/projects/products#product">Product</a> in the Project.</p>
*  <p>This is the minimal representation required for creating a <a href="/../api/projects/products#product">Product</a> in commercetools.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductImportImpl implements ProductImport {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;

    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;

    private com.commercetools.importapi.models.common.StateKeyReference state;

    private Boolean publish;

    @JsonCreator
    ProductImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("productType") final com.commercetools.importapi.models.common.ProductTypeKeyReference productType,
            @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("categories") final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories,
            @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords,
            @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory,
            @JsonProperty("searchKeywords") final com.commercetools.importapi.models.products.SearchKeywords searchKeywords,
            @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state,
            @JsonProperty("publish") final Boolean publish) {
        this.key = key;
        this.name = name;
        this.productType = productType;
        this.slug = slug;
        this.description = description;
        this.categories = categories;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.taxCategory = taxCategory;
        this.searchKeywords = searchKeywords;
        this.state = state;
        this.publish = publish;
    }

    public ProductImportImpl() {
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Maps to <code>Product.name</code>.</p>
    */
    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>The <code>productType</code> of a <a href="/../api/projects/products#product">Product</a>.
    *  Maps to <code>Product.productType</code>.
    *  The Reference to the <a href="/../api/projects/productTypes#producttype">ProductType</a> with which the Product is associated.
    *  If referenced ProductType does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>Unresolved</code> until the necessary ProductType is created.</p>
    */
    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType() {
        return this.productType;
    }

    /**
    *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a Project,
    *  but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
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
    *  <p>Maps to <code>Product.categories</code>.
    *  The References to the <a href="/../api/projects/categories#category">Categories</a> with which the Product is associated.
    *  If referenced Categories do not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>Unresolved</code> until the necessary Categories are created.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories() {
        return this.categories;
    }

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
    *  <p>The Reference to the <a href="/../api/projects/taxCategories#taxcategory">TaxCategory</a> with which the Product is associated.
    *  If referenced TaxCategory does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>Unresolved</code> until the necessary TaxCategory is created.</p>
    */
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
    *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
    *  <pre><code class="language-json">{
    *    &quot;en&quot;: [
    *      { &quot;text&quot;: &quot;Multi tool&quot; },
    *      { &quot;text&quot;: &quot;Swiss Army Knife&quot;, &quot;suggestTokenizer&quot;: { &quot;type&quot;: &quot;whitespace&quot; } }
    *    ],
    *    &quot;de&quot;: [
    *      {
    *        &quot;text&quot;: &quot;Schweizer Messer&quot;,
    *        &quot;suggestTokenizer&quot;: {
    *          &quot;type&quot;: &quot;custom&quot;,
    *          &quot;inputs&quot;: [&quot;schweizer messer&quot;, &quot;offiziersmesser&quot;, &quot;sackmesser&quot;]
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
    *  <p>The Reference to the <a href="/../api/projects/states#state">State</a> with which the Product is associated.
    *  If referenced State does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>Unresolved</code> until the necessary State is created.</p>
    */
    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    /**
    *  <p>If there were updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
    */
    public Boolean getPublish() {
        return this.publish;
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
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(taxCategory, that.taxCategory)
                .append(searchKeywords, that.searchKeywords)
                .append(state, that.state)
                .append(publish, that.publish)
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
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(taxCategory)
                .append(searchKeywords)
                .append(state)
                .append(publish)
                .toHashCode();
    }

}
