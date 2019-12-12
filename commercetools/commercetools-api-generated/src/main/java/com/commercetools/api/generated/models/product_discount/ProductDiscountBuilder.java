package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValue;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscount;
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
public final class ProductDiscountBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private java.util.List<com.commercetools.api.generated.models.common.Reference> references;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private Boolean isActive;
   
   
   private String predicate;
   
   
   private String sortOrder;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   
   private com.commercetools.api.generated.models.product_discount.ProductDiscountValue value;
   
   @Nullable
   private String key;
   
   public ProductDiscountBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductDiscountBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductDiscountBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductDiscountBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProductDiscountBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductDiscountBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductDiscountBuilder references( final java.util.List<com.commercetools.api.generated.models.common.Reference> references) {
      this.references = references;
      return this;
   }
   
   public ProductDiscountBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public ProductDiscountBuilder isActive( final Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public ProductDiscountBuilder predicate( final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ProductDiscountBuilder sortOrder( final String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public ProductDiscountBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public ProductDiscountBuilder value( final com.commercetools.api.generated.models.product_discount.ProductDiscountValue value) {
      this.value = value;
      return this;
   }
   
   public ProductDiscountBuilder key(@Nullable final String key) {
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
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Reference> getReferences(){
      return this.references;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public String getPredicate(){
      return this.predicate;
   }
   
   
   public String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.api.generated.models.product_discount.ProductDiscountValue getValue(){
      return this.value;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ProductDiscount build() {
       return new ProductDiscountImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, references, description, validFrom, isActive, predicate, sortOrder, name, validUntil, value, key);
   }
   
   public static ProductDiscountBuilder of() {
      return new ProductDiscountBuilder();
   }
   
   public static ProductDiscountBuilder of(final ProductDiscount template) {
      ProductDiscountBuilder builder = new ProductDiscountBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.references = template.getReferences();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.predicate = template.getPredicate();
      builder.sortOrder = template.getSortOrder();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}