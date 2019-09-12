package com.commercetools.models.Product;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Product.ProductCatalogData;
import com.commercetools.models.ProductType.ProductTypeReference;
import com.commercetools.models.Review.ReviewRatingStatistics;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import java.lang.String;
import com.commercetools.models.Product.Product;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.models.Product.ProductCatalogData masterData;
   
   @Nullable
   private com.commercetools.models.State.StateReference state;
   
   @Nullable
   private com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics;
   
   
   private com.commercetools.models.ProductType.ProductTypeReference productType;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory;
   
   public ProductBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductBuilder masterData( final com.commercetools.models.Product.ProductCatalogData masterData) {
      this.masterData = masterData;
      return this;
   }
   
   public ProductBuilder state(@Nullable final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   public ProductBuilder reviewRatingStatistics(@Nullable final com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics) {
      this.reviewRatingStatistics = reviewRatingStatistics;
      return this;
   }
   
   public ProductBuilder productType( final com.commercetools.models.ProductType.ProductTypeReference productType) {
      this.productType = productType;
      return this;
   }
   
   public ProductBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ProductBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.Product.ProductCatalogData getMasterData(){
      return this.masterData;
   }
   
   @Nullable
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.Review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeReference getProductType(){
      return this.productType;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public Product build() {
       return new ProductImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, masterData, state, reviewRatingStatistics, productType, key, taxCategory);
   }
   
   public static ProductBuilder of() {
      return new ProductBuilder();
   }
   
   public static ProductBuilder of(final Product template) {
      ProductBuilder builder = new ProductBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.masterData = template.getMasterData();
      builder.state = template.getState();
      builder.reviewRatingStatistics = template.getReviewRatingStatistics();
      builder.productType = template.getProductType();
      builder.key = template.getKey();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}