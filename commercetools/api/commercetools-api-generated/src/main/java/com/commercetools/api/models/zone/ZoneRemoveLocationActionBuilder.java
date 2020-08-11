package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.Location;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRemoveLocationActionBuilder {
   
   
   private com.commercetools.api.models.zone.Location location;
   
   public ZoneRemoveLocationActionBuilder location( final com.commercetools.api.models.zone.Location location) {
      this.location = location;
      return this;
   }
   
   
   public com.commercetools.api.models.zone.Location getLocation(){
      return this.location;
   }

   public ZoneRemoveLocationAction build() {
       return new ZoneRemoveLocationActionImpl(location);
   }
   
   public static ZoneRemoveLocationActionBuilder of() {
      return new ZoneRemoveLocationActionBuilder();
   }
   
   public static ZoneRemoveLocationActionBuilder of(final ZoneRemoveLocationAction template) {
      ZoneRemoveLocationActionBuilder builder = new ZoneRemoveLocationActionBuilder();
      builder.location = template.getLocation();
      return builder;
   }
   
}
