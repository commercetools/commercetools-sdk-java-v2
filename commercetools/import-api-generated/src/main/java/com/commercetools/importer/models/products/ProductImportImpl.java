package com.commercetools.importer.models.products;

import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.common.StateKeyReference;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import com.commercetools.importer.models.products.SearchKeywords;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Import representation for a prduct.</p>
*  <p>The import representation for a product is the most minimal representation required
*  for creating a product in commercetools.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductImportImpl implements ProductImport {

   private String key;
   
   private com.commercetools.importer.models.common.LocalizedString metaKeywords;
   
   private com.commercetools.importer.models.products.SearchKeywords searchKeywords;
   
   private com.commercetools.importer.models.common.LocalizedString metaTitle;
   
   private com.commercetools.importer.models.common.LocalizedString name;
   
   private com.commercetools.importer.models.common.LocalizedString description;
   
   private com.commercetools.importer.models.common.StateKeyReference state;
   
   private java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories;
   
   private com.commercetools.importer.models.common.LocalizedString metaDescription;
   
   private com.commercetools.importer.models.common.LocalizedString slug;
   
   private com.commercetools.importer.models.common.ProductTypeKeyReference productType;
   
   private com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory;

   @JsonCreator
   ProductImportImpl(@JsonProperty("key") final String key, @JsonProperty("metaKeywords") final com.commercetools.importer.models.common.LocalizedString metaKeywords, @JsonProperty("searchKeywords") final com.commercetools.importer.models.products.SearchKeywords searchKeywords, @JsonProperty("metaTitle") final com.commercetools.importer.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.importer.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.importer.models.common.LocalizedString description, @JsonProperty("state") final com.commercetools.importer.models.common.StateKeyReference state, @JsonProperty("categories") final java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories, @JsonProperty("metaDescription") final com.commercetools.importer.models.common.LocalizedString metaDescription, @JsonProperty("slug") final com.commercetools.importer.models.common.LocalizedString slug, @JsonProperty("productType") final com.commercetools.importer.models.common.ProductTypeKeyReference productType, @JsonProperty("taxCategory") final com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory) {
      this.key = key;
      this.metaKeywords = metaKeywords;
      this.searchKeywords = searchKeywords;
      this.metaTitle = metaTitle;
      this.name = name;
      this.description = description;
      this.state = state;
      this.categories = categories;
      this.metaDescription = metaDescription;
      this.slug = slug;
      this.productType = productType;
      this.taxCategory = taxCategory;
   }
   public ProductImportImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public com.commercetools.importer.models.products.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   /**
   *  <p>Maps to <code>Product.name</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>Maps to <code>Product.description</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>References a state by its key.</p>
   *  <p>The tax category referenced must already exist
   *  in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.StateKeyReference getState(){
      return this.state;
   }
   
   /**
   *  <p>An array of references to a categories by their keys. Maps to <code>Product.categories</code>.</p>
   *  <p>The categories referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> getCategories(){
      return this.categories;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   /**
   *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project,
   *  but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   /**
   *  <p>The product's product type. Maps to <code>Product.productType</code>.</p>
   *  <p>The product type referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.ProductTypeKeyReference getProductType(){
      return this.productType;
   }
   
   /**
   *  <p>References a tax category by its key.</p>
   *  <p>The tax category referenced must already exist
   *  in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.TaxCategoryKeyReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setMetaKeywords(final com.commercetools.importer.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setSearchKeywords(final com.commercetools.importer.models.products.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setMetaTitle(final com.commercetools.importer.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.importer.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.importer.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setState(final com.commercetools.importer.models.common.StateKeyReference state){
      this.state = state;
   }
   
   public void setCategories(final java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories){
      this.categories = categories;
   }
   
   public void setMetaDescription(final com.commercetools.importer.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setSlug(final com.commercetools.importer.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setProductType(final com.commercetools.importer.models.common.ProductTypeKeyReference productType){
      this.productType = productType;
   }
   
   public void setTaxCategory(final com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory){
      this.taxCategory = taxCategory;
   }

}