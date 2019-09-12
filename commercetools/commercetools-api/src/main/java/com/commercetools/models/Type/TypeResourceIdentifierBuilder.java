package com.commercetools.models.Type;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Type.TypeResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public TypeResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TypeResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
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

   public TypeResourceIdentifier build() {
       return new TypeResourceIdentifierImpl(id, key);
   }
   
   public static TypeResourceIdentifierBuilder of() {
      return new TypeResourceIdentifierBuilder();
   }
   
   public static TypeResourceIdentifierBuilder of(final TypeResourceIdentifier template) {
      TypeResourceIdentifierBuilder builder = new TypeResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}