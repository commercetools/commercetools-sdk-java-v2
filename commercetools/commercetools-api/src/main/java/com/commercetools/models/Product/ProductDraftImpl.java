package com.commercetools.models.product;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.CategoryOrderHints;
import com.commercetools.models.product.ProductVariantDraft;
import com.commercetools.models.product.SearchKeywords;
import com.commercetools.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
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

   private com.commercetools.models.product.SearchKeywords searchKeywords;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.product.ProductVariantDraft> variants;
   
   private com.commercetools.models.common.LocalizedString metaDescription;
   
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   private com.commercetools.models.product.CategoryOrderHints categoryOrderHints;
   
   private java.lang.Boolean publish;
   
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   private com.commercetools.models.product.ProductVariantDraft masterVariant;
   
   private java.util.List<com.commercetools.models.category.CategoryResourceIdentifier> categories;
   
   private java.lang.String key;
   
   private com.commercetools.models.common.LocalizedString slug;
   
   private com.commercetools.models.product_type.ProductTypeResourceIdentifier productType;

   @JsonCreator
   ProductDraftImpl(@JsonProperty("searchKeywords") final com.commercetools.models.product.SearchKeywords searchKeywords, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("variants") final java.util.List<com.commercetools.models.product.ProductVariantDraft> variants, @JsonProperty("metaDescription") final com.commercetools.models.common.LocalizedString metaDescription, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("metaKeywords") final com.commercetools.models.common.LocalizedString metaKeywords, @JsonProperty("categoryOrderHints") final com.commercetools.models.product.CategoryOrderHints categoryOrderHints, @JsonProperty("publish") final java.lang.Boolean publish, @JsonProperty("metaTitle") final com.commercetools.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("state") final com.commercetools.models.state.StateResourceIdentifier state, @JsonProperty("masterVariant") final com.commercetools.models.product.ProductVariantDraft masterVariant, @JsonProperty("categories") final java.util.List<com.commercetools.models.category.CategoryResourceIdentifier> categories, @JsonProperty("key") final java.lang.String key, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug, @JsonProperty("productType") final com.commercetools.models.product_type.ProductTypeResourceIdentifier productType) {
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
   
   
   public com.commercetools.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.product.ProductVariantDraft> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public com.commercetools.models.product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public java.lang.Boolean getPublish(){
      return this.publish;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.product.ProductVariantDraft getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.models.category.CategoryResourceIdentifier> getCategories(){
      return this.categories;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.product_type.ProductTypeResourceIdentifier getProductType(){
      return this.productType;
   }

   public void setSearchKeywords(final com.commercetools.models.product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setVariants(final java.util.List<com.commercetools.models.product.ProductVariantDraft> variants){
      this.variants = variants;
   }
   
   public void setMetaDescription(final com.commercetools.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }
   
   public void setMetaKeywords(final com.commercetools.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setCategoryOrderHints(final com.commercetools.models.product.CategoryOrderHints categoryOrderHints){
      this.categoryOrderHints = categoryOrderHints;
   }
   
   public void setPublish(final java.lang.Boolean publish){
      this.publish = publish;
   }
   
   public void setMetaTitle(final com.commercetools.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setState(final com.commercetools.models.state.StateResourceIdentifier state){
      this.state = state;
   }
   
   public void setMasterVariant(final com.commercetools.models.product.ProductVariantDraft masterVariant){
      this.masterVariant = masterVariant;
   }
   
   public void setCategories(final java.util.List<com.commercetools.models.category.CategoryResourceIdentifier> categories){
      this.categories = categories;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setProductType(final com.commercetools.models.product_type.ProductTypeResourceIdentifier productType){
      this.productType = productType;
   }

}