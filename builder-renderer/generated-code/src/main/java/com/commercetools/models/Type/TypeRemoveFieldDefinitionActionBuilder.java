package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeRemoveFieldDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeRemoveFieldDefinitionActionBuilder {
   
   
   private java.lang.String fieldName;
   
   public TypeRemoveFieldDefinitionActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }

   public TypeRemoveFieldDefinitionAction build() {
       return new TypeRemoveFieldDefinitionActionImpl(fieldName);
   }
   
   public static TypeRemoveFieldDefinitionActionBuilder of() {
      return new TypeRemoveFieldDefinitionActionBuilder();
   }
   
   public static TypeRemoveFieldDefinitionActionBuilder of(final TypeRemoveFieldDefinitionAction template) {
      TypeRemoveFieldDefinitionActionBuilder builder = new TypeRemoveFieldDefinitionActionBuilder();
      builder.fieldName = template.getFieldName();
      return builder;
   }
   
}