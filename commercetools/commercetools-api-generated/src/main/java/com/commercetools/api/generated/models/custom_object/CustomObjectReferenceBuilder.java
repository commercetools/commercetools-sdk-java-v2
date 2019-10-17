package com.commercetools.api.generated.models.custom_object;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.custom_object.CustomObject;
import com.commercetools.api.generated.models.custom_object.CustomObjectReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomObjectReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.custom_object.CustomObject obj;
   
   public CustomObjectReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomObjectReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.custom_object.CustomObject obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.custom_object.CustomObject getObj(){
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