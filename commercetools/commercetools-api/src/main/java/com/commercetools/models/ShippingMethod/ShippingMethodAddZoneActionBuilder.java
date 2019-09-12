package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodAddZoneAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodAddZoneActionBuilder {
   
   
   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodAddZoneActionBuilder zone( final com.commercetools.models.Zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
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