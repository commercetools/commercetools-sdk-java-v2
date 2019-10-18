package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.EnumValueIsUsedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class EnumValueIsUsedErrorBuilder {
   
   
   private String message;
   
   public EnumValueIsUsedErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public EnumValueIsUsedError build() {
       return new EnumValueIsUsedErrorImpl(message);
   }
   
   public static EnumValueIsUsedErrorBuilder of() {
      return new EnumValueIsUsedErrorBuilder();
   }
   
   public static EnumValueIsUsedErrorBuilder of(final EnumValueIsUsedError template) {
      EnumValueIsUsedErrorBuilder builder = new EnumValueIsUsedErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}