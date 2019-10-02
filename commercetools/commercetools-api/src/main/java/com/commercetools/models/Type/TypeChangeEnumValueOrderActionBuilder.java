package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeChangeEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeEnumValueOrderActionBuilder {
   
   
   private String fieldName;
   
   
   private java.util.List<String> keys;
   
   public TypeChangeEnumValueOrderActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeEnumValueOrderActionBuilder keys( final java.util.List<String> keys) {
      this.keys = keys;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public java.util.List<String> getKeys(){
      return this.keys;
   }

   public TypeChangeEnumValueOrderAction build() {
       return new TypeChangeEnumValueOrderActionImpl(fieldName, keys);
   }
   
   public static TypeChangeEnumValueOrderActionBuilder of() {
      return new TypeChangeEnumValueOrderActionBuilder();
   }
   
   public static TypeChangeEnumValueOrderActionBuilder of(final TypeChangeEnumValueOrderAction template) {
      TypeChangeEnumValueOrderActionBuilder builder = new TypeChangeEnumValueOrderActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.keys = template.getKeys();
      return builder;
   }
   
}