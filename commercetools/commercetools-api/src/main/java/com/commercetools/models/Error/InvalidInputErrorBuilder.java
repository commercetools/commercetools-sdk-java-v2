package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.InvalidInputError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidInputErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidInputErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InvalidInputError build() {
       return new InvalidInputErrorImpl(message);
   }
   
   public static InvalidInputErrorBuilder of() {
      return new InvalidInputErrorBuilder();
   }
   
   public static InvalidInputErrorBuilder of(final InvalidInputError template) {
      InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}