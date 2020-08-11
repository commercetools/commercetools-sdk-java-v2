package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.zone.ZoneReference;
import com.commercetools.api.models.shipping_method.ZoneRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRateBuilder {


   private com.commercetools.api.models.zone.ZoneReference zone;


   private java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates;

   public ZoneRateBuilder zone( final com.commercetools.api.models.zone.ZoneReference zone) {
      this.zone = zone;
      return this;
   }

   public ZoneRateBuilder shippingRates( final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
      this.shippingRates = shippingRates;
      return this;
   }


   public com.commercetools.api.models.zone.ZoneReference getZone(){
      return this.zone;
   }


   public java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> getShippingRates(){
      return this.shippingRates;
   }

   public ZoneRate build() {
       return new ZoneRateImpl(zone, shippingRates);
   }

   public static ZoneRateBuilder of() {
      return new ZoneRateBuilder();
   }

   public static ZoneRateBuilder of(final ZoneRate template) {
      ZoneRateBuilder builder = new ZoneRateBuilder();
      builder.zone = template.getZone();
      builder.shippingRates = template.getShippingRates();
      return builder;
   }

}
