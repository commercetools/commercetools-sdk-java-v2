package com.commercetools.models.product;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.product.ProductCatalogData;
import com.commercetools.models.product_type.ProductTypeReference;
import com.commercetools.models.review.ReviewRatingStatistics;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.tax_category.TaxCategoryReference;
import com.commercetools.models.product.Product;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.models.product.ProductCatalogData masterData;
   
   @Nullable
   private com.commercetools.models.state.StateReference state;
   
   @Nullable
   private com.commercetools.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   
   private com.commercetools.models.product_type.ProductTypeReference productType;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;
   
   public ProductBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProductBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductBuilder masterData( final com.commercetools.models.product.ProductCatalogData masterData) {
      this.masterData = masterData;
      return this;
   }
   
   public ProductBuilder state(@Nullable final com.commercetools.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public ProductBuilder reviewRatingStatistics(@Nullable final com.commercetools.models.review.ReviewRatingStatistics reviewRatingStatistics) {
      this.reviewRatingStatistics = reviewRatingStatistics;
      return this;
   }
   
   public ProductBuilder productType( final com.commercetools.models.product_type.ProductTypeReference productType) {
      this.productType = productType;
      return this;
   }
   
   public ProductBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ProductBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
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
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.product.ProductCatalogData getMasterData(){
      return this.masterData;
   }
   
   @Nullable
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public com.commercetools.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
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