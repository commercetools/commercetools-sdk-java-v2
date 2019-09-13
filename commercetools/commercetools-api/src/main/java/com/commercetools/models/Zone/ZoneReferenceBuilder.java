package com.commercetools.models.zone;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.zone.Zone;
import com.commercetools.models.zone.ZoneReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.zone.Zone obj;
   
   public ZoneReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ZoneReferenceBuilder obj(@Nullable final com.commercetools.models.zone.Zone obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.zone.Zone getObj(){
      return this.obj;
   }

   public ZoneReference build() {
       return new ZoneReferenceImpl(id, obj);
   }
   
   public static ZoneReferenceBuilder of() {
      return new ZoneReferenceBuilder();
   }
   
   public static ZoneReferenceBuilder of(final ZoneReference template) {
      ZoneReferenceBuilder builder = new ZoneReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}