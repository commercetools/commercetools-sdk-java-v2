package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_discount.ProductDiscountDraft;
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
public final class ProductDiscountDraftBuilder {
   
   
   private String predicate;
   
   
   private String sortOrder;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private Boolean isActive;
   
   
   private com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft value;
   
   @Nullable
   private String key;
   
   public ProductDiscountDraftBuilder predicate( final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ProductDiscountDraftBuilder sortOrder( final String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public ProductDiscountDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public ProductDiscountDraftBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public ProductDiscountDraftBuilder isActive( final Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public ProductDiscountDraftBuilder value( final com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft value) {
      this.value = value;
      return this;
   }
   
   public ProductDiscountDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
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
   
   
   public com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft getValue(){
      return this.value;
   }
   
   @Nullable
   public String getKey(){
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