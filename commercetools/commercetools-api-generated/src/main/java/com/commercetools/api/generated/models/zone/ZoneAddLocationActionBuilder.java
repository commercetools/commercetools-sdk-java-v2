package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.zone.Location;
import com.commercetools.api.generated.models.zone.ZoneUpdateAction;
import com.commercetools.api.generated.models.zone.ZoneAddLocationAction;
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
public final class ZoneAddLocationActionBuilder {
   
   
   private com.commercetools.api.generated.models.zone.Location location;
   
   public ZoneAddLocationActionBuilder location( final com.commercetools.api.generated.models.zone.Location location) {
      this.location = location;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.zone.Location getLocation(){
      return this.location;
   }

   public ZoneAddLocationAction build() {
       return new ZoneAddLocationActionImpl(location);
   }
   
   public static ZoneAddLocationActionBuilder of() {
      return new ZoneAddLocationActionBuilder();
   }
   
   public static ZoneAddLocationActionBuilder of(final ZoneAddLocationAction template) {
      ZoneAddLocationActionBuilder builder = new ZoneAddLocationActionBuilder();
      builder.location = template.getLocation();
      return builder;
   }
   
}