package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeFieldDefinitionOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeFieldDefinitionOrderActionBuilder {
   
   
   private java.util.List<java.lang.String> fieldNames;
   
   public TypeChangeFieldDefinitionOrderActionBuilder fieldNames( final java.util.List<java.lang.String> fieldNames) {
      this.fieldNames = fieldNames;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getFieldNames(){
      return this.fieldNames;
   }

   public TypeChangeFieldDefinitionOrderAction build() {
       return new TypeChangeFieldDefinitionOrderActionImpl(fieldNames);
   }
   
   public static TypeChangeFieldDefinitionOrderActionBuilder of() {
      return new TypeChangeFieldDefinitionOrderActionBuilder();
   }
   
   public static TypeChangeFieldDefinitionOrderActionBuilder of(final TypeChangeFieldDefinitionOrderAction template) {
      TypeChangeFieldDefinitionOrderActionBuilder builder = new TypeChangeFieldDefinitionOrderActionBuilder();
      builder.fieldNames = template.getFieldNames();
      return builder;
   }
   
}