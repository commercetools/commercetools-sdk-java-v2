package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.InvalidFieldError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidFieldErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private java.util.List<java.lang.Object> allowedValues;
   
   
   private java.lang.String field;
   
   
   private java.lang.Object invalidValue;
   
   public InvalidFieldErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public InvalidFieldErrorBuilder allowedValues(@Nullable final java.util.List<java.lang.Object> allowedValues) {
      this.allowedValues = allowedValues;
      return this;
   }
   
   public InvalidFieldErrorBuilder field( final java.lang.String field) {
      this.field = field;
      return this;
   }
   
   public InvalidFieldErrorBuilder invalidValue( final java.lang.Object invalidValue) {
      this.invalidValue = invalidValue;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.util.List<java.lang.Object> getAllowedValues(){
      return this.allowedValues;
   }
   
   
   public java.lang.String getField(){
      return this.field;
   }
   
   
   public java.lang.Object getInvalidValue(){
      return this.invalidValue;
   }

   public InvalidFieldError build() {
       return new InvalidFieldErrorImpl(message, allowedValues, field, invalidValue);
   }
   
   public static InvalidFieldErrorBuilder of() {
      return new InvalidFieldErrorBuilder();
   }
   
   public static InvalidFieldErrorBuilder of(final InvalidFieldError template) {
      InvalidFieldErrorBuilder builder = new InvalidFieldErrorBuilder();
      builder.message = template.getMessage();
      builder.allowedValues = template.getAllowedValues();
      builder.field = template.getField();
      builder.invalidValue = template.getInvalidValue();
      return builder;
   }
   
}