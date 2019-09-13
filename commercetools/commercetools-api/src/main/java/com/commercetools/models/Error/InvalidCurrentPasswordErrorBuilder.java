package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.InvalidCurrentPasswordError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidCurrentPasswordErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidCurrentPasswordErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InvalidCurrentPasswordError build() {
       return new InvalidCurrentPasswordErrorImpl(message);
   }
   
   public static InvalidCurrentPasswordErrorBuilder of() {
      return new InvalidCurrentPasswordErrorBuilder();
   }
   
   public static InvalidCurrentPasswordErrorBuilder of(final InvalidCurrentPasswordError template) {
      InvalidCurrentPasswordErrorBuilder builder = new InvalidCurrentPasswordErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}