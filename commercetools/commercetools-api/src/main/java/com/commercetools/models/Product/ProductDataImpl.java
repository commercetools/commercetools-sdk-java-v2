package com.commercetools.models.Product;

import com.commercetools.models.Category.CategoryReference;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.CategoryOrderHints;
import com.commercetools.models.Product.ProductVariant;
import com.commercetools.models.Product.SearchKeywords;
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

   private com.commercetools.models.Common.LocalizedString metaKeywords;
   
   private com.commercetools.models.Product.CategoryOrderHints categoryOrderHints;
   
   private com.commercetools.models.Product.SearchKeywords searchKeywords;
   
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.Product.ProductVariant> variants;
   
   private com.commercetools.models.Product.ProductVariant masterVariant;
   
   private java.util.List<com.commercetools.models.Category.CategoryReference> categories;
   
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   private com.commercetools.models.Common.LocalizedString slug;

   @JsonCreator
   ProductDataImpl(@JsonProperty("metaKeywords") final com.commercetools.models.Common.LocalizedString metaKeywords, @JsonProperty("categoryOrderHints") final com.commercetools.models.Product.CategoryOrderHints categoryOrderHints, @JsonProperty("searchKeywords") final com.commercetools.models.Product.SearchKeywords searchKeywords, @JsonProperty("metaTitle") final com.commercetools.models.Common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("variants") final java.util.List<com.commercetools.models.Product.ProductVariant> variants, @JsonProperty("masterVariant") final com.commercetools.models.Product.ProductVariant masterVariant, @JsonProperty("categories") final java.util.List<com.commercetools.models.Category.CategoryReference> categories, @JsonProperty("metaDescription") final com.commercetools.models.Common.LocalizedString metaDescription, @JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug) {
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
   
   
   public com.commercetools.models.Common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public com.commercetools.models.Product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public com.commercetools.models.Product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.Product.ProductVariant> getVariants(){
      return this.variants;
   }
   
   
   public com.commercetools.models.Product.ProductVariant getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.models.Category.CategoryReference> getCategories(){
      return this.categories;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setMetaKeywords(final com.commercetools.models.Common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setCategoryOrderHints(final com.commercetools.models.Product.CategoryOrderHints categoryOrderHints){
      this.categoryOrderHints = categoryOrderHints;
   }
   
   public void setSearchKeywords(final com.commercetools.models.Product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setMetaTitle(final com.commercetools.models.Common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setVariants(final java.util.List<com.commercetools.models.Product.ProductVariant> variants){
      this.variants = variants;
   }
   
   public void setMasterVariant(final com.commercetools.models.Product.ProductVariant masterVariant){
      this.masterVariant = masterVariant;
   }
   
   public void setCategories(final java.util.List<com.commercetools.models.Category.CategoryReference> categories){
      this.categories = categories;
   }
   
   public void setMetaDescription(final com.commercetools.models.Common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }

}