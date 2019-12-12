package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldBooleanType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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