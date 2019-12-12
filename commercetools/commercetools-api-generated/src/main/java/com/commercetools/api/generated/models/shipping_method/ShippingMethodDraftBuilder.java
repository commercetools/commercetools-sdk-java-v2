package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ZoneRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodDraft;
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
public final class ShippingMethodDraftBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> zoneRates;
   
   @Nullable
   private String predicate;
   
   
   private Boolean isDefault;
   
   
   private String name;
   
   @Nullable
   private String description;
   
   @Nullable
   private String key;
   
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public ShippingMethodDraftBuilder zoneRates( final java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> zoneRates) {
      this.zoneRates = zoneRates;
      return this;
   }
   
   public ShippingMethodDraftBuilder predicate(@Nullable final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ShippingMethodDraftBuilder isDefault( final Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
   }
   
   public ShippingMethodDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ShippingMethodDraftBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   public ShippingMethodDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ShippingMethodDraftBuilder taxCategory( final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ZoneRateDraft> getZoneRates(){
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
   
   
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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