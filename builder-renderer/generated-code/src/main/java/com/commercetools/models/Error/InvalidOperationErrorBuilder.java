package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidOperationError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidOperationErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidOperationErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
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