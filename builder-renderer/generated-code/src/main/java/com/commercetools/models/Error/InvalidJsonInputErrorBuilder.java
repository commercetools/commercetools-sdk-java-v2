package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidJsonInputError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidJsonInputErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidJsonInputErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InvalidJsonInputError build() {
       return new InvalidJsonInputErrorImpl(message);
   }
   
   public static InvalidJsonInputErrorBuilder of() {
      return new InvalidJsonInputErrorBuilder();
   }
   
   public static InvalidJsonInputErrorBuilder of(final InvalidJsonInputError template) {
      InvalidJsonInputErrorBuilder builder = new InvalidJsonInputErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}