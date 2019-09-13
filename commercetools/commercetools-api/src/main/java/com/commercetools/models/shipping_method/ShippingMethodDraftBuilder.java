package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ZoneRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.shipping_method.ShippingMethodDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.shipping_method.ZoneRateDraft> zoneRates;
   
   @Nullable
   private java.lang.String predicate;
   
   
   private java.lang.Boolean isDefault;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String description;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public ShippingMethodDraftBuilder zoneRates( final java.util.List<com.commercetools.models.shipping_method.ZoneRateDraft> zoneRates) {
      this.zoneRates = zoneRates;
      return this;
   }
   
   public ShippingMethodDraftBuilder predicate(@Nullable final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ShippingMethodDraftBuilder isDefault( final java.lang.Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
   }
   
   public ShippingMethodDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ShippingMethodDraftBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public ShippingMethodDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ShippingMethodDraftBuilder taxCategory( final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.shipping_method.ZoneRateDraft> getZoneRates(){
      return this.zoneRates;
   }
   
   @Nullable
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   
   public java.lang.Boolean getIsDefault(){
      return this.isDefault;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public ShippingMethodDraft build() {
       return new ShippingMethodDraftImpl(zoneRates, predicate, isDefault, name, description, key, taxCategory);
   }
   
   public static ShippingMethodDraftBuilder of() {
      return new ShippingMethodDraftBuilder();
   }
   
   public static ShippingMethodDraftBuilder of(final ShippingMethodDraft template) {
      ShippingMethodDraftBuilder builder = new ShippingMethodDraftBuilder();
      builder.zoneRates = template.getZoneRates();
      builder.predicate = template.getPredicate();
      builder.isDefault = template.getIsDefault();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}