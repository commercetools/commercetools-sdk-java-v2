package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.common.BaseResource;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.CategoryOrderHints;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.product.SearchKeywords;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.review.ReviewRatingStatistics;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import com.commercetools.api.generated.models.product.ProductProjection;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductProjectionBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.product.SearchKeywords searchKeywords;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   
   private java.util.List<com.commercetools.api.generated.models.product.ProductVariant> variants;
   
   @Nullable
   private Boolean published;
   
   @Nullable
   private Boolean hasStagedChanges;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaKeywords;
   
   @Nullable
   private com.commercetools.api.generated.models.product.CategoryOrderHints categoryOrderHints;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateReference state;
   
   
   private com.commercetools.api.generated.models.product.ProductVariant masterVariant;
   
   
   private java.util.List<com.commercetools.api.generated.models.category.CategoryReference> categories;
   
   @Nullable
   private com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   
   private com.commercetools.api.generated.models.product_type.ProductTypeReference productType;
   
   @Nullable
   private String key;
   
   public ProductProjectionBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductProjectionBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductProjectionBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductProjectionBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProductProjectionBuilder searchKeywords(@Nullable final com.commercetools.api.generated.models.product.SearchKeywords searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
   }
   
   public ProductProjectionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductProjectionBuilder variants( final java.util.List<com.commercetools.api.generated.models.product.ProductVariant> variants) {
      this.variants = variants;
      return this;
   }
   
   public ProductProjectionBuilder published(@Nullable final Boolean published) {
      this.published = published;
      return this;
   }
   
   public ProductProjectionBuilder hasStagedChanges(@Nullable final Boolean hasStagedChanges) {
      this.hasStagedChanges = hasStagedChanges;
      return this;
   }
   
   public ProductProjectionBuilder metaDescription(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public ProductProjectionBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   public ProductProjectionBuilder metaKeywords(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public ProductProjectionBuilder categoryOrderHints(@Nullable final com.commercetools.api.generated.models.product.CategoryOrderHints categoryOrderHints) {
      this.categoryOrderHints = categoryOrderHints;
      return this;
   }
   
   public ProductProjectionBuilder metaTitle(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public ProductProjectionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductProjectionBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public ProductProjectionBuilder masterVariant( final com.commercetools.api.generated.models.product.ProductVariant masterVariant) {
      this.masterVariant = masterVariant;
      return this;
   }
   
   public ProductProjectionBuilder categories( final java.util.List<com.commercetools.api.generated.models.category.CategoryReference> categories) {
      this.categories = categories;
      return this;
   }
   
   public ProductProjectionBuilder reviewRatingStatistics(@Nullable final com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics) {
      this.reviewRatingStatistics = reviewRatingStatistics;
      return this;
   }
   
   public ProductProjectionBuilder slug( final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ProductProjectionBuilder productType( final com.commercetools.api.generated.models.product_type.ProductTypeReference productType) {
      this.productType = productType;
      return this;
   }
   
   public ProductProjectionBuilder key(@Nullable final String key) {
      this.key = key;
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
   public com.commercetools.api.generated.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.ProductVariant> getVariants(){
      return this.variants;
   }
   
   @Nullable
   public Boolean getPublished(){
      return this.published;
   }
   
   @Nullable
   public Boolean getHasStagedChanges(){
      return this.hasStagedChanges;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.CategoryOrderHints getCategoryOrderHints(){
      return this.categoryOrderHints;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductVariant getMasterVariant(){
      return this.masterVariant;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.category.CategoryReference> getCategories(){
      return this.categories;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.api.generated.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ProductProjection build() {
       return new ProductProjectionImpl(createdAt, lastModifiedAt, id, version, searchKeywords, description, variants, published, hasStagedChanges, metaDescription, taxCategory, metaKeywords, categoryOrderHints, metaTitle, name, state, masterVariant, categories, reviewRatingStatistics, slug, productType, key);
   }
   
   public static ProductProjectionBuilder of() {
      return new ProductProjectionBuilder();
   }
   
   public static ProductProjectionBuilder of(final ProductProjection template) {
      ProductProjectionBuilder builder = new ProductProjectionBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.searchKeywords = template.getSearchKeywords();
      builder.description = template.getDescription();
      builder.variants = template.getVariants();
      builder.published = template.getPublished();
      builder.hasStagedChanges = template.getHasStagedChanges();
      builder.metaDescription = template.getMetaDescription();
      builder.taxCategory = template.getTaxCategory();
      builder.metaKeywords = template.getMetaKeywords();
      builder.categoryOrderHints = template.getCategoryOrderHints();
      builder.metaTitle = template.getMetaTitle();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.masterVariant = template.getMasterVariant();
      builder.categories = template.getCategories();
      builder.reviewRatingStatistics = template.getReviewRatingStatistics();
      builder.slug = template.getSlug();
      builder.productType = template.getProductType();
      builder.key = template.getKey();
      return builder;
   }
   
}