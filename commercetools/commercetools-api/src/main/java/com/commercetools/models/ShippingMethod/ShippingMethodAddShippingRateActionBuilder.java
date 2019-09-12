package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodAddShippingRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodAddShippingRateActionBuilder {
   
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   
   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodAddShippingRateActionBuilder shippingRate( final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public ShippingMethodAddShippingRateActionBuilder zone( final com.commercetools.models.Zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public ShippingMethodAddShippingRateAction build() {
       return new ShippingMethodAddShippingRateActionImpl(shippingRate, zone);
   }
   
   public static ShippingMethodAddShippingRateActionBuilder of() {
      return new ShippingMethodAddShippingRateActionBuilder();
   }
   
   public static ShippingMethodAddShippingRateActionBuilder of(final ShippingMethodAddShippingRateAction template) {
      ShippingMethodAddShippingRateActionBuilder builder = new ShippingMethodAddShippingRateActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.zone = template.getZone();
      return builder;
   }
   
}