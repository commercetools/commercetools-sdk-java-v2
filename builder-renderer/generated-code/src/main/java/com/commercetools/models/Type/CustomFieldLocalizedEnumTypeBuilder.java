package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldLocalizedEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldLocalizedEnumTypeBuilder {
   
   
   private java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values;
   
   public CustomFieldLocalizedEnumTypeBuilder values( final java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> getValues(){
      return this.values;
   }

   public CustomFieldLocalizedEnumType build() {
       return new CustomFieldLocalizedEnumTypeImpl(values);
   }
   
   public static CustomFieldLocalizedEnumTypeBuilder of() {
      return new CustomFieldLocalizedEnumTypeBuilder();
   }
   
   public static CustomFieldLocalizedEnumTypeBuilder of(final CustomFieldLocalizedEnumType template) {
      CustomFieldLocalizedEnumTypeBuilder builder = new CustomFieldLocalizedEnumTypeBuilder();
      builder.values = template.getValues();
      return builder;
   }
   
}