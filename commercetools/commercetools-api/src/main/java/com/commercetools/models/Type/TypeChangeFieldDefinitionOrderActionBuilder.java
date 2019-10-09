package com.commercetools.models.type;

import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeChangeFieldDefinitionOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeFieldDefinitionOrderActionBuilder {
   
   
   private java.util.List<String> fieldNames;
   
   public TypeChangeFieldDefinitionOrderActionBuilder fieldNames( final java.util.List<String> fieldNames) {
      this.fieldNames = fieldNames;
      return this;
   }
   
   
   public java.util.List<String> getFieldNames(){
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