package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.shipping_method.ZoneRate;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   
   private java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates;
   
   @Nullable
   private String predicate;
   
   
   private Boolean isDefault;
   
   
   private String name;
   
   @Nullable
   private String description;
   
   @Nullable
   private String key;
   
   
   private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;
   
   public ShippingMethodBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ShippingMethodBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ShippingMethodBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ShippingMethodBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ShippingMethodBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ShippingMethodBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ShippingMethodBuilder zoneRates( final java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> zoneRates) {
      this.zoneRates = zoneRates;
      return this;
   }
   
   public ShippingMethodBuilder predicate(@Nullable final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ShippingMethodBuilder isDefault( final Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
   }
   
   public ShippingMethodBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ShippingMethodBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   public ShippingMethodBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ShippingMethodBuilder taxCategory( final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
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
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.api.models.shipping_method.ZoneRate> getZoneRates(){
      return this.zoneRates;
   }
   
   @Nullable
   public String getPredicate(){
      return this.predicate;
   }
   
   
   public Boolean getIsDefault(){
      return this.isDefault;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getDescription(){
      return this.description;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public ShippingMethod build() {
       return new ShippingMethodImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, zoneRates, predicate, isDefault, name, description, key, taxCategory);
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
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
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
