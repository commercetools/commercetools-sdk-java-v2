package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.zone.ZoneUpdateAction;
import com.commercetools.api.generated.models.zone.ZoneSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneSetDescriptionActionBuilder {
   
   @Nullable
   private String description;
   
   public ZoneSetDescriptionActionBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public String getDescription(){
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