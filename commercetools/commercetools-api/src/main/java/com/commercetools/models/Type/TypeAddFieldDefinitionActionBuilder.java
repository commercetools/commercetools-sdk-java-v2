package com.commercetools.models.type;

import com.commercetools.models.type.FieldDefinition;
import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeAddFieldDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeAddFieldDefinitionActionBuilder {
   
   
   private com.commercetools.models.type.FieldDefinition fieldDefinition;
   
   public TypeAddFieldDefinitionActionBuilder fieldDefinition( final com.commercetools.models.type.FieldDefinition fieldDefinition) {
      this.fieldDefinition = fieldDefinition;
      return this;
   }
   
   
   public com.commercetools.models.type.FieldDefinition getFieldDefinition(){
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