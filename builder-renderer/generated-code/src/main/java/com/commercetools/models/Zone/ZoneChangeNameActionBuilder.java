package com.commercetools.models.Zone;

import com.commercetools.models.Zone.ZoneUpdateAction;
import java.lang.String;
import com.commercetools.models.Zone.ZoneChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneChangeNameActionBuilder {
   
   
   private java.lang.String name;
   
   public ZoneChangeNameActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public ZoneChangeNameAction build() {
       return new ZoneChangeNameActionImpl(name);
   }
   
   public static ZoneChangeNameActionBuilder of() {
      return new ZoneChangeNameActionBuilder();
   }
   
   public static ZoneChangeNameActionBuilder of(final ZoneChangeNameAction template) {
      ZoneChangeNameActionBuilder builder = new ZoneChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}