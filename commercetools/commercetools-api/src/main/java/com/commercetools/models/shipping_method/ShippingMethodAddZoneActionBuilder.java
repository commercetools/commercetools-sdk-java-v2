package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.models.zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.shipping_method.ShippingMethodAddZoneAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodAddZoneActionBuilder {
   
   
   private com.commercetools.models.zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodAddZoneActionBuilder zone( final com.commercetools.models.zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.models.zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public ShippingMethodAddZoneAction build() {
       return new ShippingMethodAddZoneActionImpl(zone);
   }
   
   public static ShippingMethodAddZoneActionBuilder of() {
      return new ShippingMethodAddZoneActionBuilder();
   }
   
   public static ShippingMethodAddZoneActionBuilder of(final ShippingMethodAddZoneAction template) {
      ShippingMethodAddZoneActionBuilder builder = new ShippingMethodAddZoneActionBuilder();
      builder.zone = template.getZone();
      return builder;
   }
   
}