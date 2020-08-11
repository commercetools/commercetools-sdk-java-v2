package com.commercetools.api.models.product;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.CategoryOrderHints;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product.SearchKeywords;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
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
public final class ProductProjectionImpl implements ProductProjection {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.models.product.SearchKeywords searchKeywords;
   
   private com.commercetools.api.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.api.models.product.ProductVariant> variants;
   
   private Boolean published;
   
   private Boolean hasStagedChanges;
   
   private com.commercetools.api.models.common.LocalizedString metaDescription;
   
   private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;
   
   private com.commercetools.api.models.common.LocalizedString metaKeywords;
   
   private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;
   
   private com.commercetools.api.models.common.LocalizedString metaTitle;
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   private com.commercetools.api.models.state.StateReference state;
   
   private com.commercetools.api.models.product.ProductVariant masterVariant;
   
   private java.util.List<com.commercetools.api.models.category.CategoryReference> categories;
   
   private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   private com.commercetools.api.models.common.LocalizedString slug;
   
   private com.commercetools.api.models.product_type.ProductTypeReference productType;
   
   private String key;

   @JsonCreator
   ProductProjectionImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("variants") final java.util.List<com.commercetools.api.models.product.ProductVariant> variants, @JsonProperty("published") final Boolean published, @JsonProperty("hasStagedChanges") final Boolean hasStagedChanges, @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory, @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords, @JsonProperty("categoryOrderHints") final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints, @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("masterVariant") final com.commercetools.api.models.product.ProductVariant masterVariant, @JsonProperty("categories") final java.util.List<com.commercetools.api.models.category.CategoryReference> categories, @JsonProperty("reviewRatingStatistics") final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType, @JsonProperty("key") final String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.searchKeywords = searchKeywords;
      this.description = description;
      this.variants = variants;
      this.published = published;
      this.hasStagedChanges = hasStagedChanges;
      this.metaDescription = metaDescription;
      this.taxCategory = taxCategory;
      this.metaKeywords = metaKeywords;
      this.categoryOrderHints = categoryOrderHints;
      this.metaTitle = metaTitle;
      this.name = name;
      this.state = state;
      this.masterVariant = masterVariant;
      this.categories = categories;
      this.reviewRatingStatistics = reviewRatingStatistics;
      this.slug = slug;
      this.productType = productType;
      this.key = key;
   }
   public ProductProjectionImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>The unique ID of the Product.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The current version of the Product.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.models.product.ProductVariant> getVariants(){
      return this.variants;
   }
   
   
   public Boolean getPublished(){
      return this.published;
   }
   
   
   public Boolean getHasStagedChanges(){
      return this.hasStagedChanges;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public com.commercetools.api.models.product.ProductVariant getMasterVariant(){
      return this.masterVariant;
   }
   
   /**
   *  <p>References to categories the product is in.</p>
   */
   public java.util.List<com.commercetools.api.models.category.CategoryReference> getCategories(){
      return this.categories;
   }
   
   /**
   *  <p>Statistics about the review ratings taken into account for this product.</p>
   */
   public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.api.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }
   
   /**
   *  <p>User-specific unique identifier of the Product.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setVariants(final java.util.List<com.commercetools.api.models.product.ProductVariant> variants){
      this.variants = variants;
   }
   
   public void setPublished(final Boolean published){
      this.published = published;
   }
   
   public void setHasStagedChanges(final Boolean hasStagedChanges){
      this.hasStagedChanges = hasStagedChanges;
   }
   
   public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }
   
   public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setCategoryOrderHints(final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints){
      this.categoryOrderHints = categoryOrderHints;
   }
   
   public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setState(final com.commercetools.api.models.state.StateReference state){
      this.state = state;
   }
   
   public void setMasterVariant(final com.commercetools.api.models.product.ProductVariant masterVariant){
      this.masterVariant = masterVariant;
   }
   
   public void setCategories(final java.util.List<com.commercetools.api.models.category.CategoryReference> categories){
      this.categories = categories;
   }
   
   public void setReviewRatingStatistics(final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics){
      this.reviewRatingStatistics = reviewRatingStatistics;
   }
   
   public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType){
      this.productType = productType;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}
