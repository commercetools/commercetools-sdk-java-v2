package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InvalidSubjectError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidSubjectErrorBuilder {
   
   
   private java.lang.String message;
   
   public InvalidSubjectErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InvalidSubjectError build() {
       return new InvalidSubjectErrorImpl(message);
   }
   
   public static InvalidSubjectErrorBuilder of() {
      return new InvalidSubjectErrorBuilder();
   }
   
   public static InvalidSubjectErrorBuilder of(final InvalidSubjectError template) {
      InvalidSubjectErrorBuilder builder = new InvalidSubjectErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}