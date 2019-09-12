package com.commercetools.models.Product;

import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.CategoryOrderHints;
import com.commercetools.models.Product.ProductVariantDraft;
import com.commercetools.models.Product.SearchKeywords;
import com.commercetools.models.ProductType.ProductTypeResourceIdentifier;
import com.commercetools.models.State.StateResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDraftImpl implements ProductDraft {

   private com.commercetools.models.Product.SearchKeywords searchKeywords;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.Product.ProductVariantDraft> variants;
   
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   private com.commercetools.models.Common.LocalizedString metaKeywords;
   
   private com.commercetools.models.Product.CategoryOrderHints categoryOrderHints;
   
   private java.lang.Boolean publish;
   
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.State.StateResourceIdentifier state;
   
   private com.commercetools.models.Product.ProductVariantDraft masterVariant;
   
   private java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> categories;
   
   private java.lang.String key;
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   private com.commercetools.models.ProductType.ProductTypeResourceIdentifier productType;

   @JsonCreator
   ProductDraftImpl(@JsonProperty("searchKeywords") final com.commercetools.models.Product.SearchKeywords searchKeywords, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("variants") final java.util.List<com.commercetools.models.Product.ProductVariantDraft> variants, @JsonProperty("metaDescription") final com.commercetools.models.Common.LocalizedString metaDescription, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("metaKeywords") final com.commercetools.models.Common.LocalizedString metaKeywords, @JsonProperty("categoryOrderHints") final com.commercetools.models.Product.CategoryOrderHints categoryOrderHints, @JsonProperty("publish") final java.lang.Boolean publish, @JsonProperty("metaTitle") final com.commercetools.models.Common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("state") final com.commercetools.models.State.StateResourceIdentifier state, @JsonProperty("masterVariant") final com.commercetools.models.Product.ProductVariantDraft masterVariant, @JsonProperty("categories") final java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> categories, @JsonProperty("key") final java.lang.String key, @JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug, @JsonProperty("productType") final com.commercetools.models.ProductType.ProductTypeResourceIdentifier productType) {
      this.searchKeywords = searchKeywords;
      this.description = description;
      this.variants = variants;
      this.metaDescription = metaDescription;
      this.taxCategory = taxCategory;
      this.metaKeywords = metaKeywords;
      this.categoryOrderHints = categoryOrderHints;
      this.publish = publish;
      this.metaTitle = metaTitle;
      this.name = name;
      this.state = state;
      this.masterVariant = masterVariant;
      this.categories = categories;
      this.key = key;
      this.slug = slug;
      this.productType = productType;
   }
   public ProductDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.Product.ProductVariantDraft> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public com.commercetools.models.Product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public java.lang.Boolean getPublish(){
      return this.publish;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.Product.ProductVariantDraft getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> getCategories(){
      return this.categories;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeResourceIdentifier getProductType(){
      return this.productType;
   }

   public void setSearchKeywords(final com.commercetools.models.Product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setVariants(final java.util.List<com.commercetools.models.Product.ProductVariantDraft> variants){
      this.variants = variants;
   }
   
   public void setMetaDescription(final com.commercetools.models.Common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }
   
   public void setMetaKeywords(final com.commercetools.models.Common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setCategoryOrderHints(final com.commercetools.models.Product.CategoryOrderHints categoryOrderHints){
      this.categoryOrderHints = categoryOrderHints;
   }
   
   public void setPublish(final java.lang.Boolean publish){
      this.publish = publish;
   }
   
   public void setMetaTitle(final com.commercetools.models.Common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setState(final com.commercetools.models.State.StateResourceIdentifier state){
      this.state = state;
   }
   
   public void setMasterVariant(final com.commercetools.models.Product.ProductVariantDraft masterVariant){
      this.masterVariant = masterVariant;
   }
   
   public void setCategories(final java.util.List<com.commercetools.models.Category.CategoryResourceIdentifier> categories){
      this.categories = categories;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setProductType(final com.commercetools.models.ProductType.ProductTypeResourceIdentifier productType){
      this.productType = productType;
   }

}