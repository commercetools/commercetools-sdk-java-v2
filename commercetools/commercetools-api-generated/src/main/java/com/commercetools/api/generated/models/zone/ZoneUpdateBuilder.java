package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.zone.ZoneUpdateAction;
import com.commercetools.api.generated.models.zone.ZoneUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.zone.ZoneUpdateAction> actions;
   
   
   private Long version;
   
   public ZoneUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.zone.ZoneUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ZoneUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.zone.ZoneUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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