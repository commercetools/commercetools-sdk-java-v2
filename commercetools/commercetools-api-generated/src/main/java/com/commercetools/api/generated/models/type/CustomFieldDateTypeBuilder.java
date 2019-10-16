package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldDateType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldDateTypeBuilder {
   
   
   

   public CustomFieldDateType build() {
       return new CustomFieldDateTypeImpl();
   }
   
   public static CustomFieldDateTypeBuilder of() {
      return new CustomFieldDateTypeBuilder();
   }
   
   public static CustomFieldDateTypeBuilder of(final CustomFieldDateType template) {
      CustomFieldDateTypeBuilder builder = new CustomFieldDateTypeBuilder();
      return builder;
   }
   
}