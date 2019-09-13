package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.AccessDeniedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AccessDeniedErrorBuilder {
   
   
   private java.lang.String message;
   
   public AccessDeniedErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public AccessDeniedError build() {
       return new AccessDeniedErrorImpl(message);
   }
   
   public static AccessDeniedErrorBuilder of() {
      return new AccessDeniedErrorBuilder();
   }
   
   public static AccessDeniedErrorBuilder of(final AccessDeniedError template) {
      AccessDeniedErrorBuilder builder = new AccessDeniedErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}