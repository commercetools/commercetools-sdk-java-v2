package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.type.TypeChangeLocalizedEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeLocalizedEnumValueOrderActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private java.util.List<java.lang.String> keys;
   
   public TypeChangeLocalizedEnumValueOrderActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeLocalizedEnumValueOrderActionBuilder keys( final java.util.List<java.lang.String> keys) {
      this.keys = keys;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public java.util.List<java.lang.String> getKeys(){
      return this.keys;
   }

   public TypeChangeLocalizedEnumValueOrderAction build() {
       return new TypeChangeLocalizedEnumValueOrderActionImpl(fieldName, keys);
   }
   
   public static TypeChangeLocalizedEnumValueOrderActionBuilder of() {
      return new TypeChangeLocalizedEnumValueOrderActionBuilder();
   }
   
   public static TypeChangeLocalizedEnumValueOrderActionBuilder of(final TypeChangeLocalizedEnumValueOrderAction template) {
      TypeChangeLocalizedEnumValueOrderActionBuilder builder = new TypeChangeLocalizedEnumValueOrderActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.keys = template.getKeys();
      return builder;
   }
   
}