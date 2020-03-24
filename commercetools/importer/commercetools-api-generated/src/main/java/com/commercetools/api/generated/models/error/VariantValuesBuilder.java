package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.error.VariantValues;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class VariantValuesBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes;
   
   
   private java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices;
   
   @Nullable
   private String sku;
   
   public VariantValuesBuilder attributes( final java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public VariantValuesBuilder prices( final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public VariantValuesBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public String getSku(){
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