package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldDateTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
