package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodRemoveShippingRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodRemoveShippingRateActionBuilder {
   
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   
   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodRemoveShippingRateActionBuilder shippingRate( final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public ShippingMethodRemoveShippingRateActionBuilder zone( final com.commercetools.models.Zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public ShippingMethodRemoveShippingRateAction build() {
       return new ShippingMethodRemoveShippingRateActionImpl(shippingRate, zone);
   }
   
   public static ShippingMethodRemoveShippingRateActionBuilder of() {
      return new ShippingMethodRemoveShippingRateActionBuilder();
   }
   
   public static ShippingMethodRemoveShippingRateActionBuilder of(final ShippingMethodRemoveShippingRateAction template) {
      ShippingMethodRemoveShippingRateActionBuilder builder = new ShippingMethodRemoveShippingRateActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.zone = template.getZone();
      return builder;
   }
   
}