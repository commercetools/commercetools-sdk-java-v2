package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.InvalidTokenError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidTokenErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidTokenErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InvalidTokenError build() {
       return new InvalidTokenErrorImpl(message);
   }
   
   public static InvalidTokenErrorBuilder of() {
      return new InvalidTokenErrorBuilder();
   }
   
   public static InvalidTokenErrorBuilder of(final InvalidTokenError template) {
      InvalidTokenErrorBuilder builder = new InvalidTokenErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}