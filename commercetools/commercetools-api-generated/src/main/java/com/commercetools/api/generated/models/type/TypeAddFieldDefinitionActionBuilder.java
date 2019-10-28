package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldDefinition;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeAddFieldDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeAddFieldDefinitionActionBuilder {
   
   
   private com.commercetools.api.generated.models.type.FieldDefinition fieldDefinition;
   
   public TypeAddFieldDefinitionActionBuilder fieldDefinition( final com.commercetools.api.generated.models.type.FieldDefinition fieldDefinition) {
      this.fieldDefinition = fieldDefinition;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldDefinition getFieldDefinition(){
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