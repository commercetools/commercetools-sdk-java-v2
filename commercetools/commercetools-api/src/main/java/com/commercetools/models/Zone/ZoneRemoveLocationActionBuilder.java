package com.commercetools.models.Zone;

import com.commercetools.models.Zone.Location;
import com.commercetools.models.Zone.ZoneUpdateAction;
import java.lang.String;
import com.commercetools.models.Zone.ZoneRemoveLocationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneRemoveLocationActionBuilder {
   
   
   private com.commercetools.models.Zone.Location location;
   
   public ZoneRemoveLocationActionBuilder location( final com.commercetools.models.Zone.Location location) {
      this.location = location;
      return this;
   }
   
   
   public com.commercetools.models.Zone.Location getLocation(){
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