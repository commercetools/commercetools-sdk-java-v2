package com.commercetools.models.product;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.product.ProductCatalogData;
import com.commercetools.models.product_type.ProductTypeReference;
import com.commercetools.models.review.ReviewRatingStatistics;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.tax_category.TaxCategoryReference;
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
public final class ProductImpl implements Product {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.product.ProductCatalogData masterData;
   
   private com.commercetools.models.state.StateReference state;
   
   private com.commercetools.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   private com.commercetools.models.product_type.ProductTypeReference productType;
   
   private String key;
   
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;

   @JsonCreator
   ProductImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("masterData") final com.commercetools.models.product.ProductCatalogData masterData, @JsonProperty("state") final com.commercetools.models.state.StateReference state, @JsonProperty("reviewRatingStatistics") final com.commercetools.models.review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("productType") final com.commercetools.models.product_type.ProductTypeReference productType, @JsonProperty("key") final String key, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.masterData = masterData;
      this.state = state;
      this.reviewRatingStatistics = reviewRatingStatistics;
      this.productType = productType;
      this.key = key;
      this.taxCategory = taxCategory;
   }
   public ProductImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.product.ProductCatalogData getMasterData(){
      return this.masterData;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public com.commercetools.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
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
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setMasterData(final com.commercetools.models.product.ProductCatalogData masterData){
      this.masterData = masterData;
   }
   
   public void setState(final com.commercetools.models.state.StateReference state){
      this.state = state;
   }
   
   public void setReviewRatingStatistics(final com.commercetools.models.review.ReviewRatingStatistics reviewRatingStatistics){
      this.reviewRatingStatistics = reviewRatingStatistics;
   }
   
   public void setProductType(final com.commercetools.models.product_type.ProductTypeReference productType){
      this.productType = productType;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}