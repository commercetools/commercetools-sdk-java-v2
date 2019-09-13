package com.commercetools.models.product;

import com.commercetools.models.category.CategoryReference;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.CategoryOrderHints;
import com.commercetools.models.product.ProductVariant;
import com.commercetools.models.product.SearchKeywords;
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
public final class ProductDataImpl implements ProductData {

   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   private com.commercetools.models.product.CategoryOrderHints categoryOrderHints;
   
   private com.commercetools.models.product.SearchKeywords searchKeywords;
   
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.product.ProductVariant> variants;
   
   private com.commercetools.models.product.ProductVariant masterVariant;
   
   private java.util.List<com.commercetools.models.category.CategoryReference> categories;
   
   private com.commercetools.models.common.LocalizedString metaDescription;
   
   private com.commercetools.models.common.LocalizedString slug;

   @JsonCreator
   ProductDataImpl(@JsonProperty("metaKeywords") final com.commercetools.models.common.LocalizedString metaKeywords, @JsonProperty("categoryOrderHints") final com.commercetools.models.product.CategoryOrderHints categoryOrderHints, @JsonProperty("searchKeywords") final com.commercetools.models.product.SearchKeywords searchKeywords, @JsonProperty("metaTitle") final com.commercetools.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("variants") final java.util.List<com.commercetools.models.product.ProductVariant> variants, @JsonProperty("masterVariant") final com.commercetools.models.product.ProductVariant masterVariant, @JsonProperty("categories") final java.util.List<com.commercetools.models.category.CategoryReference> categories, @JsonProperty("metaDescription") final com.commercetools.models.common.LocalizedString metaDescription, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug) {
      this.metaKeywords = metaKeywords;
      this.categoryOrderHints = categoryOrderHints;
      this.searchKeywords = searchKeywords;
      this.metaTitle = metaTitle;
      this.name = name;
      this.description = description;
      this.variants = variants;
      this.masterVariant = masterVariant;
      this.categories = categories;
      this.metaDescription = metaDescription;
      this.slug = slug;
   }
   public ProductDataImpl() {
      
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public com.commercetools.models.product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public com.commercetools.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.product.ProductVariant> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.models.product.ProductVariant getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.models.category.CategoryReference> getCategories(){
      return this.categories;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setMetaKeywords(final com.commercetools.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setCategoryOrderHints(final com.commercetools.models.product.CategoryOrderHints categoryOrderHints){
      this.categoryOrderHints = categoryOrderHints;
   }
   
   public void setSearchKeywords(final com.commercetools.models.product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setMetaTitle(final com.commercetools.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setVariants(final java.util.List<com.commercetools.models.product.ProductVariant> variants){
      this.variants = variants;
   }
   
   public void setMasterVariant(final com.commercetools.models.product.ProductVariant masterVariant){
      this.masterVariant = masterVariant;
   }
   
   public void setCategories(final java.util.List<com.commercetools.models.category.CategoryReference> categories){
      this.categories = categories;
   }
   
   public void setMetaDescription(final com.commercetools.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }

}