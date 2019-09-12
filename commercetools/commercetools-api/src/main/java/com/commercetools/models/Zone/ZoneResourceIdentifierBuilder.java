package com.commercetools.models.Zone;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ZoneResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ZoneResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ZoneResourceIdentifier build() {
       return new ZoneResourceIdentifierImpl(id, key);
   }
   
   public static ZoneResourceIdentifierBuilder of() {
      return new ZoneResourceIdentifierBuilder();
   }
   
   public static ZoneResourceIdentifierBuilder of(final ZoneResourceIdentifier template) {
      ZoneResourceIdentifierBuilder builder = new ZoneResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}