package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldEnumValue;
import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeAddEnumValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeAddEnumValueActionBuilder {
   
   
   private String fieldName;
   
   
   private com.commercetools.models.type.CustomFieldEnumValue value;
   
   public TypeAddEnumValueActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeAddEnumValueActionBuilder value( final com.commercetools.models.type.CustomFieldEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.type.CustomFieldEnumValue getValue(){
      return this.value;
   }

   public TypeAddEnumValueAction build() {
       return new TypeAddEnumValueActionImpl(fieldName, value);
   }
   
   public static TypeAddEnumValueActionBuilder of() {
      return new TypeAddEnumValueActionBuilder();
   }
   
   public static TypeAddEnumValueActionBuilder of(final TypeAddEnumValueAction template) {
      TypeAddEnumValueActionBuilder builder = new TypeAddEnumValueActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}