package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.RequiredFieldError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class RequiredFieldErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private java.lang.String field;
   
   public RequiredFieldErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public RequiredFieldErrorBuilder field( final java.lang.String field) {
      this.field = field;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getField(){
      return this.field;
   }

   public RequiredFieldError build() {
       return new RequiredFieldErrorImpl(message, field);
   }
   
   public static RequiredFieldErrorBuilder of() {
      return new RequiredFieldErrorBuilder();
   }
   
   public static RequiredFieldErrorBuilder of(final RequiredFieldError template) {
      RequiredFieldErrorBuilder builder = new RequiredFieldErrorBuilder();
      builder.message = template.getMessage();
      builder.field = template.getField();
      return builder;
   }
   
}