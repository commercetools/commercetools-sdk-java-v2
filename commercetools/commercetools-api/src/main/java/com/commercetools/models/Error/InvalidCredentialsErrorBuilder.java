package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.InvalidCredentialsError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidCredentialsErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidCredentialsErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InvalidCredentialsError build() {
       return new InvalidCredentialsErrorImpl(message);
   }
   
   public static InvalidCredentialsErrorBuilder of() {
      return new InvalidCredentialsErrorBuilder();
   }
   
   public static InvalidCredentialsErrorBuilder of(final InvalidCredentialsError template) {
      InvalidCredentialsErrorBuilder builder = new InvalidCredentialsErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}