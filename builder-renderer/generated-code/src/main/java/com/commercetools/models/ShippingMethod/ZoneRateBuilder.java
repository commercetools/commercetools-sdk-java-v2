package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingRate;
import com.commercetools.models.Zone.ZoneReference;
import com.commercetools.models.ShippingMethod.ZoneRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneRateBuilder {
   
   
   private com.commercetools.models.Zone.ZoneReference zone;
   
   
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> shippingRates;
   
   public ZoneRateBuilder zone( final com.commercetools.models.Zone.ZoneReference zone) {
      this.zone = zone;
      return this;
   }
   
   public ZoneRateBuilder shippingRates( final java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> shippingRates) {
      this.shippingRates = shippingRates;
      return this;
   }
   
   
   public com.commercetools.models.Zone.ZoneReference getZone(){
      return this.zone;
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> getShippingRates(){
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