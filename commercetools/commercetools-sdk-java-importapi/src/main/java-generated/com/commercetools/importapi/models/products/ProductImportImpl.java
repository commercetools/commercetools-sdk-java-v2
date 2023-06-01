package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductPriceModeEnum;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.products.SearchKeywords;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The data representation for a Product to be imported that is persisted as a Product in the Project.</p>
 *  <p>This is the minimal representation required for creating a Product in commercetools.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductImportImpl implements ProductImport, ModelBase {

    
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
    
    
    private com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductImportImpl(@JsonProperty("key") final String key, @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name, @JsonProperty("productType") final com.commercetools.importapi.models.common.ProductTypeKeyReference productType, @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug, @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description, @JsonProperty("categories") final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories, @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle, @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription, @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords, @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory, @JsonProperty("searchKeywords") final com.commercetools.importapi.models.products.SearchKeywords searchKeywords, @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state, @JsonProperty("publish") final Boolean publish, @JsonProperty("priceMode") final com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode) {
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
        this.priceMode = priceMode;
    }
    /**
     * create empty instance
     */
    public ProductImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Maps to <code>Product.name</code>.</p>
     */
    
    public com.commercetools.importapi.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the Product is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
     */
    
    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType(){
        return this.productType;
    }
    
    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a Project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
     */
    
    public com.commercetools.importapi.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>Maps to <code>Product.description</code>.</p>
     */
    
    public com.commercetools.importapi.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Maps to <code>Product.categories</code>. The References to the Categories with which the Product is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     */
    
    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories(){
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
    
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle(){
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
    
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription(){
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
    
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords(){
        return this.metaKeywords;
    }
    
    /**
     *  <p>The Reference to the TaxCategory with which the Product is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
     */
    
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory(){
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
    
    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords(){
        return this.searchKeywords;
    }
    
    /**
     *  <p>The Reference to the State with which the Product is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>
     */
    
    public com.commercetools.importapi.models.common.StateKeyReference getState(){
        return this.state;
    }
    
    /**
     *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
     */
    
    public Boolean getPublish(){
        return this.publish;
    }
    
    /**
     *  <p>Determines the type of Prices the API uses. See ProductPriceMode for more details. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     */
    
    public com.commercetools.importapi.models.common.ProductPriceModeEnum getPriceMode(){
        return this.priceMode;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setName(final com.commercetools.importapi.models.common.LocalizedString name){
        this.name = name;
    }
    
    
    public void setProductType(final com.commercetools.importapi.models.common.ProductTypeKeyReference productType){
        this.productType = productType;
    }
    
    
    public void setSlug(final com.commercetools.importapi.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    
    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description){
        this.description = description;
    }
    
    
    public void setCategories(final com.commercetools.importapi.models.common.CategoryKeyReference ...categories){
       this.categories = new ArrayList<>(Arrays.asList(categories));
    }
    
    
    public void setCategories(final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories){
       this.categories = categories;
    }
    
    
    public void setMetaTitle(final com.commercetools.importapi.models.common.LocalizedString metaTitle){
        this.metaTitle = metaTitle;
    }
    
    
    public void setMetaDescription(final com.commercetools.importapi.models.common.LocalizedString metaDescription){
        this.metaDescription = metaDescription;
    }
    
    
    public void setMetaKeywords(final com.commercetools.importapi.models.common.LocalizedString metaKeywords){
        this.metaKeywords = metaKeywords;
    }
    
    
    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory){
        this.taxCategory = taxCategory;
    }
    
    
    public void setSearchKeywords(final com.commercetools.importapi.models.products.SearchKeywords searchKeywords){
        this.searchKeywords = searchKeywords;
    }
    
    
    public void setState(final com.commercetools.importapi.models.common.StateKeyReference state){
        this.state = state;
    }
    
    
    public void setPublish(final Boolean publish){
        this.publish = publish;
    }
    
    
    public void setPriceMode(final com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode){
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductImportImpl that = (ProductImportImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
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
                .append(priceMode, that.priceMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
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
            .append(priceMode)
            .toHashCode();
    }

}
