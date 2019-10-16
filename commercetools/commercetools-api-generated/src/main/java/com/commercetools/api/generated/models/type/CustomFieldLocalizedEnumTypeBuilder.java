package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldLocalizedEnumTypeBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values;
   
   public CustomFieldLocalizedEnumTypeBuilder values( final java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> getValues(){
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