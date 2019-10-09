package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.InvalidOperationError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidOperationErrorBuilder {
   
   
   private String message;
   
   public InvalidOperationErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public InvalidOperationError build() {
       return new InvalidOperationErrorImpl(message);
   }
   
   public static InvalidOperationErrorBuilder of() {
      return new InvalidOperationErrorBuilder();
   }
   
   public static InvalidOperationErrorBuilder of(final InvalidOperationError template) {
      InvalidOperationErrorBuilder builder = new InvalidOperationErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}