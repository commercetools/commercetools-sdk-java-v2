package com.commercetools.models.Error;

import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.Attribute;
import java.lang.String;
import com.commercetools.models.Error.VariantValues;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class VariantValuesBuilder {
   
   
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   @Nullable
   private java.lang.String sku;
   
   public VariantValuesBuilder attributes( final java.util.List<com.commercetools.models.Product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public VariantValuesBuilder prices( final java.util.List<com.commercetools.models.Common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public VariantValuesBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.util.List<com.commercetools.models.Common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public VariantValues build() {
       return new VariantValuesImpl(attributes, prices, sku);
   }
   
   public static VariantValuesBuilder of() {
      return new VariantValuesBuilder();
   }
   
   public static VariantValuesBuilder of(final VariantValues template) {
      VariantValuesBuilder builder = new VariantValuesBuilder();
      builder.attributes = template.getAttributes();
      builder.prices = template.getPrices();
      builder.sku = template.getSku();
      return builder;
   }
   
}