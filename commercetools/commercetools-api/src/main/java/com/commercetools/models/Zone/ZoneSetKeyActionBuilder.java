package com.commercetools.models.zone;

import com.commercetools.models.zone.ZoneUpdateAction;
import java.lang.String;
import com.commercetools.models.zone.ZoneSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public ZoneSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ZoneSetKeyAction build() {
       return new ZoneSetKeyActionImpl(key);
   }
   
   public static ZoneSetKeyActionBuilder of() {
      return new ZoneSetKeyActionBuilder();
   }
   
   public static ZoneSetKeyActionBuilder of(final ZoneSetKeyAction template) {
      ZoneSetKeyActionBuilder builder = new ZoneSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}