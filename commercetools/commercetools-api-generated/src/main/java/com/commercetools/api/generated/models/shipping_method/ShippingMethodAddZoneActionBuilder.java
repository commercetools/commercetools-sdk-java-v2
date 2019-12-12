package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodAddZoneAction;
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
public final class ShippingMethodAddZoneActionBuilder {
   
   
   private com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone;
   
   public ShippingMethodAddZoneActionBuilder zone( final com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.zone.ZoneResourceIdentifier getZone(){
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