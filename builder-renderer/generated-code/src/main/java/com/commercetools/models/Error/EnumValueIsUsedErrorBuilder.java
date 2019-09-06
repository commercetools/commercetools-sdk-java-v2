package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.EnumValueIsUsedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class EnumValueIsUsedErrorBuilder {
   
   
   private java.lang.String message;
   
   public EnumValueIsUsedErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
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