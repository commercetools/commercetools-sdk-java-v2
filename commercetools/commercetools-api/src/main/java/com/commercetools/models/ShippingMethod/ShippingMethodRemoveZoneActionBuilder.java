package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodRemoveZoneAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodRemoveZoneActionBuilder {
   
   
   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodRemoveZoneActionBuilder zone( final com.commercetools.models.Zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public ShippingMethodRemoveZoneAction build() {
       return new ShippingMethodRemoveZoneActionImpl(zone);
   }
   
   public static ShippingMethodRemoveZoneActionBuilder of() {
      return new ShippingMethodRemoveZoneActionBuilder();
   }
   
   public static ShippingMethodRemoveZoneActionBuilder of(final ShippingMethodRemoveZoneAction template) {
      ShippingMethodRemoveZoneActionBuilder builder = new ShippingMethodRemoveZoneActionBuilder();
      builder.zone = template.getZone();
      return builder;
   }
   
}