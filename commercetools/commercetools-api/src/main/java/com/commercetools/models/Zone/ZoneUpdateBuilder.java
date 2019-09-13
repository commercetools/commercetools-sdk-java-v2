package com.commercetools.models.zone;

import com.commercetools.models.zone.ZoneUpdateAction;
import java.lang.Long;
import com.commercetools.models.zone.ZoneUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.zone.ZoneUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ZoneUpdateBuilder actions( final java.util.List<com.commercetools.models.zone.ZoneUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ZoneUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.zone.ZoneUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ZoneUpdate build() {
       return new ZoneUpdateImpl(actions, version);
   }
   
   public static ZoneUpdateBuilder of() {
      return new ZoneUpdateBuilder();
   }
   
   public static ZoneUpdateBuilder of(final ZoneUpdate template) {
      ZoneUpdateBuilder builder = new ZoneUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}