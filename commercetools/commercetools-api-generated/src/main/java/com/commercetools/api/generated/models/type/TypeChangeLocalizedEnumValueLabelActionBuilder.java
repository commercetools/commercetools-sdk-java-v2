package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeLocalizedEnumValueLabelActionBuilder {
   
   
   private String fieldName;
   
   
   private com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue value;
   
   public TypeChangeLocalizedEnumValueLabelActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeLocalizedEnumValueLabelActionBuilder value( final com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue getValue(){
      return this.value;
   }

   public TypeChangeLocalizedEnumValueLabelAction build() {
       return new TypeChangeLocalizedEnumValueLabelActionImpl(fieldName, value);
   }
   
   public static TypeChangeLocalizedEnumValueLabelActionBuilder of() {
      return new TypeChangeLocalizedEnumValueLabelActionBuilder();
   }
   
   public static TypeChangeLocalizedEnumValueLabelActionBuilder of(final TypeChangeLocalizedEnumValueLabelAction template) {
      TypeChangeLocalizedEnumValueLabelActionBuilder builder = new TypeChangeLocalizedEnumValueLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}