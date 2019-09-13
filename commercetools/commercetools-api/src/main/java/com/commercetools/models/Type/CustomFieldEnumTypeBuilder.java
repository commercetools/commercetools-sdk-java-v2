package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldEnumValue;
import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldEnumTypeBuilder {
   
   
   private java.util.List<com.commercetools.models.type.CustomFieldEnumValue> values;
   
   public CustomFieldEnumTypeBuilder values( final java.util.List<com.commercetools.models.type.CustomFieldEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.type.CustomFieldEnumValue> getValues(){
      return this.values;
   }

   public CustomFieldEnumType build() {
       return new CustomFieldEnumTypeImpl(values);
   }
   
   public static CustomFieldEnumTypeBuilder of() {
      return new CustomFieldEnumTypeBuilder();
   }
   
   public static CustomFieldEnumTypeBuilder of(final CustomFieldEnumType template) {
      CustomFieldEnumTypeBuilder builder = new CustomFieldEnumTypeBuilder();
      builder.values = template.getValues();
      return builder;
   }
   
}