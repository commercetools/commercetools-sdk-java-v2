package com.commercetools.models.shipping_method;

import com.commercetools.models.common.BaseResource;
import com.commercetools.models.shipping_method.ZoneRate;
import com.commercetools.models.tax_category.TaxCategoryReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.shipping_method.ShippingMethod;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.util.List<com.commercetools.models.shipping_method.ZoneRate> zoneRates;
   
   @Nullable
   private java.lang.String predicate;
   
   
   private java.lang.Boolean isDefault;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String description;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;
   
   public ShippingMethodBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ShippingMethodBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ShippingMethodBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ShippingMethodBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ShippingMethodBuilder zoneRates( final java.util.List<com.commercetools.models.shipping_method.ZoneRate> zoneRates) {
      this.zoneRates = zoneRates;
      return this;
   }
   
   public ShippingMethodBuilder predicate(@Nullable final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ShippingMethodBuilder isDefault( final java.lang.Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
   }
   
   public ShippingMethodBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ShippingMethodBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public ShippingMethodBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ShippingMethodBuilder taxCategory( final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
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
   
   
   public java.util.List<com.commercetools.models.shipping_method.ZoneRate> getZoneRates(){
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
   
   
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public ShippingMethod build() {
       return new ShippingMethodImpl(createdAt, lastModifiedAt, id, version, zoneRates, predicate, isDefault, name, description, key, taxCategory);
   }
   
   public static ShippingMethodBuilder of() {
      return new ShippingMethodBuilder();
   }
   
   public static ShippingMethodBuilder of(final ShippingMethod template) {
      ShippingMethodBuilder builder = new ShippingMethodBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
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