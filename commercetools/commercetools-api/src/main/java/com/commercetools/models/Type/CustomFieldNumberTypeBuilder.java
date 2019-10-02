package com.commercetools.models.type;

import com.commercetools.models.type.FieldType;
import com.commercetools.models.type.CustomFieldNumberType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldNumberTypeBuilder {
   
   
   

   public CustomFieldNumberType build() {
       return new CustomFieldNumberTypeImpl();
   }
   
   public static CustomFieldNumberTypeBuilder of() {
      return new CustomFieldNumberTypeBuilder();
   }
   
   public static CustomFieldNumberTypeBuilder of(final CustomFieldNumberType template) {
      CustomFieldNumberTypeBuilder builder = new CustomFieldNumberTypeBuilder();
      return builder;
   }
   
}