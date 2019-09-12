package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeAddLocalizedEnumValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeAddLocalizedEnumValueActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.Type.CustomFieldLocalizedEnumValue value;
   
   public TypeAddLocalizedEnumValueActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeAddLocalizedEnumValueActionBuilder value( final com.commercetools.models.Type.CustomFieldLocalizedEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Type.CustomFieldLocalizedEnumValue getValue(){
      return this.value;
   }

   public TypeAddLocalizedEnumValueAction build() {
       return new TypeAddLocalizedEnumValueActionImpl(fieldName, value);
   }
   
   public static TypeAddLocalizedEnumValueActionBuilder of() {
      return new TypeAddLocalizedEnumValueActionBuilder();
   }
   
   public static TypeAddLocalizedEnumValueActionBuilder of(final TypeAddLocalizedEnumValueAction template) {
      TypeAddLocalizedEnumValueActionBuilder builder = new TypeAddLocalizedEnumValueActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}