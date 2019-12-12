package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
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
public final class ShippingRateDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers;
   
   
   private com.commercetools.api.generated.models.common.Money price;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money freeAbove;
   
   public ShippingRateDraftBuilder tiers(@Nullable final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public ShippingRateDraftBuilder price( final com.commercetools.api.generated.models.common.Money price) {
      this.price = price;
      return this;
   }
   
   public ShippingRateDraftBuilder freeAbove(@Nullable final com.commercetools.api.generated.models.common.Money freeAbove) {
      this.freeAbove = freeAbove;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getFreeAbove(){
      return this.freeAbove;
   }

   public ShippingRateDraft build() {
       return new ShippingRateDraftImpl(tiers, price, freeAbove);
   }
   
   public static ShippingRateDraftBuilder of() {
      return new ShippingRateDraftBuilder();
   }
   
   public static ShippingRateDraftBuilder of(final ShippingRateDraft template) {
      ShippingRateDraftBuilder builder = new ShippingRateDraftBuilder();
      builder.tiers = template.getTiers();
      builder.price = template.getPrice();
      builder.freeAbove = template.getFreeAbove();
      return builder;
   }
   
}