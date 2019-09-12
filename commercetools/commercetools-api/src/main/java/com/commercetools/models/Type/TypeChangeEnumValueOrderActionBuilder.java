package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeEnumValueOrderActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private java.util.List<java.lang.String> keys;
   
   public TypeChangeEnumValueOrderActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeEnumValueOrderActionBuilder keys( final java.util.List<java.lang.String> keys) {
      this.keys = keys;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public java.util.List<java.lang.String> getKeys(){
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