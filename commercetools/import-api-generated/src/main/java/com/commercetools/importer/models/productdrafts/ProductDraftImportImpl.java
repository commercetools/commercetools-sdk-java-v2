package com.commercetools.importer.models.productdrafts;

import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.common.StateKeyReference;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import com.commercetools.importer.models.productdrafts.ProductVariantDraftImport;
import com.commercetools.importer.models.products.SearchKeywords;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDraftImportImpl implements ProductDraftImport {

   private com.commercetools.importer.models.common.ProductTypeKeyReference productType;
   
   private com.commercetools.importer.models.common.LocalizedString name;
   
   private com.commercetools.importer.models.common.LocalizedString slug;
   
   private String key;
   
   private com.commercetools.importer.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories;
   
   private com.commercetools.importer.models.common.LocalizedString metaTitle;
   
   private com.commercetools.importer.models.common.LocalizedString metaDescription;
   
   private com.commercetools.importer.models.common.LocalizedString metaKeywords;
   
   private com.commercetools.importer.models.productdrafts.ProductVariantDraftImport masterVariant;
   
   private java.util.List<com.commercetools.importer.models.productdrafts.ProductVariantDraftImport> variants;
   
   private com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory;
   
   private com.commercetools.importer.models.products.SearchKeywords searchKeywords;
   
   private com.commercetools.importer.models.common.StateKeyReference state;
   
   private Boolean publish;

   @JsonCreator
   ProductDraftImportImpl(@JsonProperty("productType") final com.commercetools.importer.models.common.ProductTypeKeyReference productType, @JsonProperty("name") final com.commercetools.importer.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.importer.models.common.LocalizedString slug, @JsonProperty("key") final String key, @JsonProperty("description") final com.commercetools.importer.models.common.LocalizedString description, @JsonProperty("categories") final java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories, @JsonProperty("metaTitle") final com.commercetools.importer.models.common.LocalizedString metaTitle, @JsonProperty("metaDescription") final com.commercetools.importer.models.common.LocalizedString metaDescription, @JsonProperty("metaKeywords") final com.commercetools.importer.models.common.LocalizedString metaKeywords, @JsonProperty("masterVariant") final com.commercetools.importer.models.productdrafts.ProductVariantDraftImport masterVariant, @JsonProperty("variants") final java.util.List<com.commercetools.importer.models.productdrafts.ProductVariantDraftImport> variants, @JsonProperty("taxCategory") final com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory, @JsonProperty("searchKeywords") final com.commercetools.importer.models.products.SearchKeywords searchKeywords, @JsonProperty("state") final com.commercetools.importer.models.common.StateKeyReference state, @JsonProperty("publish") final Boolean publish) {
      this.productType = productType;
      this.name = name;
      this.slug = slug;
      this.key = key;
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
   }
   public ProductDraftImportImpl() {
      
   }
   
   /**
   *  <p>A predefined product type assigned to the product.
   *  All products must have a product type.</p>
   */
   public com.commercetools.importer.models.common.ProductTypeKeyReference getProductType(){
      return this.productType;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>Human-readable identifiers usually used as deep-link URLs for the product.
   *  A slug must be unique across a project, but a product can have the same slug for different languages.
   *  Slugs have a maximum size of 256.
   *  Valid characters are alphabetic characters (<code>A-Z, a-z</code>), numeric characters (<code>0-9</code>), underscores (<code>_</code>) and hyphens (<code>-</code>).</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   /**
   *  <p>User-specific unique identifier for the product.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>Categories assigned to the product.</p>
   */
   public java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> getCategories(){
      return this.categories;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   /**
   *  <p>The master product variant.
   *  Required if the <code>variants</code> array has product variants.</p>
   */
   public com.commercetools.importer.models.productdrafts.ProductVariantDraftImport getMasterVariant(){
      return this.masterVariant;
   }
   
   /**
   *  <p>An array of related product variants.</p>
   */
   public java.util.List<com.commercetools.importer.models.productdrafts.ProductVariantDraftImport> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.importer.models.common.TaxCategoryKeyReference getTaxCategory(){
      return this.taxCategory;
   }
   
   
   public com.commercetools.importer.models.products.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.importer.models.common.StateKeyReference getState(){
      return this.state;
   }
   
   /**
   *  <p>If <code>true</code>, the product is published immediately.</p>
   */
   public Boolean getPublish(){
      return this.publish;
   }

   public void setProductType(final com.commercetools.importer.models.common.ProductTypeKeyReference productType){
      this.productType = productType;
   }
   
   public void setName(final com.commercetools.importer.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSlug(final com.commercetools.importer.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setDescription(final com.commercetools.importer.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setCategories(final java.util.List<com.commercetools.importer.models.common.CategoryKeyReference> categories){
      this.categories = categories;
   }
   
   public void setMetaTitle(final com.commercetools.importer.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setMetaDescription(final com.commercetools.importer.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setMetaKeywords(final com.commercetools.importer.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setMasterVariant(final com.commercetools.importer.models.productdrafts.ProductVariantDraftImport masterVariant){
      this.masterVariant = masterVariant;
   }
   
   public void setVariants(final java.util.List<com.commercetools.importer.models.productdrafts.ProductVariantDraftImport> variants){
      this.variants = variants;
   }
   
   public void setTaxCategory(final com.commercetools.importer.models.common.TaxCategoryKeyReference taxCategory){
      this.taxCategory = taxCategory;
   }
   
   public void setSearchKeywords(final com.commercetools.importer.models.products.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setState(final com.commercetools.importer.models.common.StateKeyReference state){
      this.state = state;
   }
   
   public void setPublish(final Boolean publish){
      this.publish = publish;
   }

}