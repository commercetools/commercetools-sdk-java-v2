package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldBooleanType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldBooleanTypeBuilder {
   
   
   

   public CustomFieldBooleanType build() {
       return new CustomFieldBooleanTypeImpl();
   }
   
   public static CustomFieldBooleanTypeBuilder of() {
      return new CustomFieldBooleanTypeBuilder();
   }
   
   public static CustomFieldBooleanTypeBuilder of(final CustomFieldBooleanType template) {
      CustomFieldBooleanTypeBuilder builder = new CustomFieldBooleanTypeBuilder();
      return builder;
   }
   
}