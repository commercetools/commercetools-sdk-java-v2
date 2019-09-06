package com.commercetools.models.CustomObject;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.CustomObject.CustomObject;
import com.commercetools.models.CustomObject.CustomObjectReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomObjectReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.CustomObject.CustomObject obj;
   
   public CustomObjectReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomObjectReferenceBuilder obj(@Nullable final com.commercetools.models.CustomObject.CustomObject obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.CustomObject.CustomObject getObj(){
      return this.obj;
   }

   public CustomObjectReference build() {
       return new CustomObjectReferenceImpl(id, obj);
   }
   
   public static CustomObjectReferenceBuilder of() {
      return new CustomObjectReferenceBuilder();
   }
   
   public static CustomObjectReferenceBuilder of(final CustomObjectReference template) {
      CustomObjectReferenceBuilder builder = new CustomObjectReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}