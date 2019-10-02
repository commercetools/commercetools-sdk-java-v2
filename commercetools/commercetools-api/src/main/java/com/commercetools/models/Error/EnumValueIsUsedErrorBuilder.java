package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.EnumValueIsUsedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

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