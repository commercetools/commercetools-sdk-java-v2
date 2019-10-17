package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodRemoveShippingRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodRemoveShippingRateActionBuilder {
   
   
   private com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate;
   
   
   private com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodRemoveShippingRateActionBuilder shippingRate( final com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public ShippingMethodRemoveShippingRateActionBuilder zone( final com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.api.generated.models.zone.ZoneResourceIdentifier getZone(){
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