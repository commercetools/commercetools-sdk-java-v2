package com.commercetools.models.type;

import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldMoneyType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldMoneyTypeBuilder {
   
   
   

   public CustomFieldMoneyType build() {
       return new CustomFieldMoneyTypeImpl();
   }
   
   public static CustomFieldMoneyTypeBuilder of() {
      return new CustomFieldMoneyTypeBuilder();
   }
   
   public static CustomFieldMoneyTypeBuilder of(final CustomFieldMoneyType template) {
      CustomFieldMoneyTypeBuilder builder = new CustomFieldMoneyTypeBuilder();
      return builder;
   }
   
}