package com.commercetools.models.Zone;

import com.commercetools.models.Zone.ZoneUpdateAction;
import java.lang.String;
import com.commercetools.models.Zone.ZoneSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneSetDescriptionActionBuilder {
   
   @Nullable
   private java.lang.String description;
   
   public ZoneSetDescriptionActionBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public java.lang.String getDescription(){
      return this.description;
   }

   public ZoneSetDescriptionAction build() {
       return new ZoneSetDescriptionActionImpl(description);
   }
   
   public static ZoneSetDescriptionActionBuilder of() {
      return new ZoneSetDescriptionActionBuilder();
   }
   
   public static ZoneSetDescriptionActionBuilder of(final ZoneSetDescriptionAction template) {
      ZoneSetDescriptionActionBuilder builder = new ZoneSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}