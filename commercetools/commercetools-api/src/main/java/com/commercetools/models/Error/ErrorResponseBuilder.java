package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.error.ErrorResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ErrorResponseBuilder {
   
   @Nullable
   private java.lang.String error_description;
   
   @Nullable
   private java.lang.String error;
   
   
   private java.lang.String message;
   
   @Nullable
   private java.util.List<com.commercetools.models.error.ErrorObject> errors;
   
   
   private java.lang.Integer statusCode;
   
   public ErrorResponseBuilder error_description(@Nullable final java.lang.String error_description) {
      this.error_description = error_description;
      return this;
   }
   
   public ErrorResponseBuilder error(@Nullable final java.lang.String error) {
      this.error = error;
      return this;
   }
   
   public ErrorResponseBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public ErrorResponseBuilder errors(@Nullable final java.util.List<com.commercetools.models.error.ErrorObject> errors) {
      this.errors = errors;
      return this;
   }
   
   public ErrorResponseBuilder statusCode( final java.lang.Integer statusCode) {
      this.statusCode = statusCode;
      return this;
   }
   
   @Nullable
   public java.lang.String getError_description(){
      return this.error_description;
   }
   
   @Nullable
   public java.lang.String getError(){
      return this.error;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.error.ErrorObject> getErrors(){
      return this.errors;
   }
   
   
   public java.lang.Integer getStatusCode(){
      return this.statusCode;
   }

   public ErrorResponse build() {
       return new ErrorResponseImpl(error_description, error, message, errors, statusCode);
   }
   
   public static ErrorResponseBuilder of() {
      return new ErrorResponseBuilder();
   }
   
   public static ErrorResponseBuilder of(final ErrorResponse template) {
      ErrorResponseBuilder builder = new ErrorResponseBuilder();
      builder.error_description = template.getErrorDescription();
      builder.error = template.getError();
      builder.message = template.getMessage();
      builder.errors = template.getErrors();
      builder.statusCode = template.getStatusCode();
      return builder;
   }
   
}