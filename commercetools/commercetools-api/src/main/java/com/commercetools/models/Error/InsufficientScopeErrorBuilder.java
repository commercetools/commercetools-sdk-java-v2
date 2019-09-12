package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InsufficientScopeError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InsufficientScopeErrorBuilder {
   
   
   private java.lang.String message;
   
   public InsufficientScopeErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public InsufficientScopeError build() {
       return new InsufficientScopeErrorImpl(message);
   }
   
   public static InsufficientScopeErrorBuilder of() {
      return new InsufficientScopeErrorBuilder();
   }
   
   public static InsufficientScopeErrorBuilder of(final InsufficientScopeError template) {
      InsufficientScopeErrorBuilder builder = new InsufficientScopeErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}