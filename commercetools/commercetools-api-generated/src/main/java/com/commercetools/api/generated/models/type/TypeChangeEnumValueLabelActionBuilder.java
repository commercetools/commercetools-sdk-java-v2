package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldEnumValue;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeChangeEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeEnumValueLabelActionBuilder {
   
   
   private String fieldName;
   
   
   private com.commercetools.api.generated.models.type.CustomFieldEnumValue value;
   
   public TypeChangeEnumValueLabelActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeEnumValueLabelActionBuilder value( final com.commercetools.api.generated.models.type.CustomFieldEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldEnumValue getValue(){
      return this.value;
   }

   public TypeChangeEnumValueLabelAction build() {
       return new TypeChangeEnumValueLabelActionImpl(fieldName, value);
   }
   
   public static TypeChangeEnumValueLabelActionBuilder of() {
      return new TypeChangeEnumValueLabelActionBuilder();
   }
   
   public static TypeChangeEnumValueLabelActionBuilder of(final TypeChangeEnumValueLabelAction template) {
      TypeChangeEnumValueLabelActionBuilder builder = new TypeChangeEnumValueLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}