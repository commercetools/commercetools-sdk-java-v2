package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldEnumValue;
import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeChangeEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeEnumValueLabelActionBuilder {
   
   
   private String fieldName;
   
   
   private com.commercetools.models.type.CustomFieldEnumValue value;
   
   public TypeChangeEnumValueLabelActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeEnumValueLabelActionBuilder value( final com.commercetools.models.type.CustomFieldEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.type.CustomFieldEnumValue getValue(){
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