package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldStringType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldStringTypeBuilder {
   
   
   

   public CustomFieldStringType build() {
       return new CustomFieldStringTypeImpl();
   }
   
   public static CustomFieldStringTypeBuilder of() {
      return new CustomFieldStringTypeBuilder();
   }
   
   public static CustomFieldStringTypeBuilder of(final CustomFieldStringType template) {
      CustomFieldStringTypeBuilder builder = new CustomFieldStringTypeBuilder();
      return builder;
   }
   
}