package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeLocalizedEnumValueLabelActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.Type.CustomFieldLocalizedEnumValue value;
   
   public TypeChangeLocalizedEnumValueLabelActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeLocalizedEnumValueLabelActionBuilder value( final com.commercetools.models.Type.CustomFieldLocalizedEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Type.CustomFieldLocalizedEnumValue getValue(){
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