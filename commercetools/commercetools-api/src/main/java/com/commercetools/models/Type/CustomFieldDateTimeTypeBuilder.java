package com.commercetools.models.type;

import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldDateTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldDateTimeTypeBuilder {
   
   
   

   public CustomFieldDateTimeType build() {
       return new CustomFieldDateTimeTypeImpl();
   }
   
   public static CustomFieldDateTimeTypeBuilder of() {
      return new CustomFieldDateTimeTypeBuilder();
   }
   
   public static CustomFieldDateTimeTypeBuilder of(final CustomFieldDateTimeType template) {
      CustomFieldDateTimeTypeBuilder builder = new CustomFieldDateTimeTypeBuilder();
      return builder;
   }
   
}