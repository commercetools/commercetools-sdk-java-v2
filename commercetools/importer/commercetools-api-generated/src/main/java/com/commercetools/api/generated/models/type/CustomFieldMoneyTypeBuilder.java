package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldMoneyType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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