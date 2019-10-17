package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidTokenError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidTokenErrorBuilder {
   
   
   private String message;
   
   public InvalidTokenErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
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