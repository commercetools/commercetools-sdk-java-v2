package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ErrorResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorResponseBuilder {
   
   @Nullable
   private String error_description;
   
   @Nullable
   private String error;
   
   
   private String message;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.error.ErrorObject> errors;
   
   
   private Integer statusCode;
   
   public ErrorResponseBuilder error_description(@Nullable final String error_description) {
      this.error_description = error_description;
      return this;
   }
   
   public ErrorResponseBuilder error(@Nullable final String error) {
      this.error = error;
      return this;
   }
   
   public ErrorResponseBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ErrorResponseBuilder errors(@Nullable final java.util.List<com.commercetools.api.generated.models.error.ErrorObject> errors) {
      this.errors = errors;
      return this;
   }
   
   public ErrorResponseBuilder statusCode( final Integer statusCode) {
      this.statusCode = statusCode;
      return this;
   }
   
   @Nullable
   public String getError_description(){
      return this.error_description;
   }
   
   @Nullable
   public String getError(){
      return this.error;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.error.ErrorObject> getErrors(){
      return this.errors;
   }
   
   
   public Integer getStatusCode(){
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