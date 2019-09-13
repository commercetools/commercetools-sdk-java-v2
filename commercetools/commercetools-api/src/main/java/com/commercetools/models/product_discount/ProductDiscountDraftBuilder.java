package com.commercetools.models.product_discount;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_discount.ProductDiscountValue;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.product_discount.ProductDiscountDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountDraftBuilder {
   
   
   private java.lang.String predicate;
   
   
   private java.lang.String sortOrder;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private java.lang.Boolean isActive;
   
   
   private com.commercetools.models.product_discount.ProductDiscountValue value;
   
   @Nullable
   private java.lang.String key;
   
   public ProductDiscountDraftBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ProductDiscountDraftBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public ProductDiscountDraftBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public ProductDiscountDraftBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public ProductDiscountDraftBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public ProductDiscountDraftBuilder value( final com.commercetools.models.product_discount.ProductDiscountValue value) {
      this.value = value;
      return this;
   }
   
   public ProductDiscountDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.models.product_discount.ProductDiscountValue getValue(){
      return this.value;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductDiscountDraft build() {
       return new ProductDiscountDraftImpl(predicate, sortOrder, name, validUntil, description, validFrom, isActive, value, key);
   }
   
   public static ProductDiscountDraftBuilder of() {
      return new ProductDiscountDraftBuilder();
   }
   
   public static ProductDiscountDraftBuilder of(final ProductDiscountDraft template) {
      ProductDiscountDraftBuilder builder = new ProductDiscountDraftBuilder();
      builder.predicate = template.getPredicate();
      builder.sortOrder = template.getSortOrder();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}