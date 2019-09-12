package com.commercetools.models.Zone;

import com.commercetools.models.Zone.Location;
import com.commercetools.models.Zone.ZoneUpdateAction;
import java.lang.String;
import com.commercetools.models.Zone.ZoneAddLocationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneAddLocationActionBuilder {
   
   
   private com.commercetools.models.Zone.Location location;
   
   public ZoneAddLocationActionBuilder location( final com.commercetools.models.Zone.Location location) {
      this.location = location;
      return this;
   }
   
   
   public com.commercetools.models.Zone.Location getLocation(){
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