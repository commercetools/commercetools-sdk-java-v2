package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeChangeKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeKeyActionBuilder {
   
   
   private String key;
   
   public TypeChangeKeyActionBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public TypeChangeKeyAction build() {
       return new TypeChangeKeyActionImpl(key);
   }
   
   public static TypeChangeKeyActionBuilder of() {
      return new TypeChangeKeyActionBuilder();
   }
   
   public static TypeChangeKeyActionBuilder of(final TypeChangeKeyAction template) {
      TypeChangeKeyActionBuilder builder = new TypeChangeKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}