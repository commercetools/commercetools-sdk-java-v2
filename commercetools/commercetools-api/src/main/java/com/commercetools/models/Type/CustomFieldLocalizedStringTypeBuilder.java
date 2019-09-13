package com.commercetools.models.type;

import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldLocalizedStringType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldLocalizedStringTypeBuilder {
   
   
   

   public CustomFieldLocalizedStringType build() {
       return new CustomFieldLocalizedStringTypeImpl();
   }
   
   public static CustomFieldLocalizedStringTypeBuilder of() {
      return new CustomFieldLocalizedStringTypeBuilder();
   }
   
   public static CustomFieldLocalizedStringTypeBuilder of(final CustomFieldLocalizedStringType template) {
      CustomFieldLocalizedStringTypeBuilder builder = new CustomFieldLocalizedStringTypeBuilder();
      return builder;
   }
   
}