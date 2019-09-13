package com.commercetools.models.type;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.type.Type;
import com.commercetools.models.type.TypeReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.type.Type obj;
   
   public TypeReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TypeReferenceBuilder obj(@Nullable final com.commercetools.models.type.Type obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.type.Type getObj(){
      return this.obj;
   }

   public TypeReference build() {
       return new TypeReferenceImpl(id, obj);
   }
   
   public static TypeReferenceBuilder of() {
      return new TypeReferenceBuilder();
   }
   
   public static TypeReferenceBuilder of(final TypeReference template) {
      TypeReferenceBuilder builder = new TypeReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}