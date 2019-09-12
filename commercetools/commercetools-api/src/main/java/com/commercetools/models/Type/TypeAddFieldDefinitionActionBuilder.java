package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldDefinition;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeAddFieldDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeAddFieldDefinitionActionBuilder {
   
   
   private com.commercetools.models.Type.FieldDefinition fieldDefinition;
   
   public TypeAddFieldDefinitionActionBuilder fieldDefinition( final com.commercetools.models.Type.FieldDefinition fieldDefinition) {
      this.fieldDefinition = fieldDefinition;
      return this;
   }
   
   
   public com.commercetools.models.Type.FieldDefinition getFieldDefinition(){
      return this.fieldDefinition;
   }

   public TypeAddFieldDefinitionAction build() {
       return new TypeAddFieldDefinitionActionImpl(fieldDefinition);
   }
   
   public static TypeAddFieldDefinitionActionBuilder of() {
      return new TypeAddFieldDefinitionActionBuilder();
   }
   
   public static TypeAddFieldDefinitionActionBuilder of(final TypeAddFieldDefinitionAction template) {
      TypeAddFieldDefinitionActionBuilder builder = new TypeAddFieldDefinitionActionBuilder();
      builder.fieldDefinition = template.getFieldDefinition();
      return builder;
   }
   
}