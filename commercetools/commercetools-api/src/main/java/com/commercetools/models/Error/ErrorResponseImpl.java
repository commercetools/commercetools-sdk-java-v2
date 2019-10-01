package com.commercetools.models.error;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorResponseImpl implements ErrorResponse {

   private java.lang.String errorDescription;
   
   private java.lang.String error;
   
   private java.lang.String message;
   
   private java.util.List<com.commercetools.models.error.ErrorObject> errors;
   
   private java.lang.Integer statusCode;

   @JsonCreator
   ErrorResponseImpl(@JsonProperty("error_description") final java.lang.String errorDescription, @JsonProperty("error") final java.lang.String error, @JsonProperty("message") final java.lang.String message, @JsonProperty("errors") final java.util.List<com.commercetools.models.error.ErrorObject> errors, @JsonProperty("statusCode") final java.lang.Integer statusCode) {
      this.errorDescription = errorDescription;
      this.error = error;
      this.message = message;
      this.errors = errors;
      this.statusCode = statusCode;
   }
   public ErrorResponseImpl() {
      
   }
   
   
   public java.lang.String getErrorDescription(){
      return this.errorDescription;
   }
   
   
   public java.lang.String getError(){
      return this.error;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.error.ErrorObject> getErrors(){
      return this.errors;
   }
   
   
   public java.lang.Integer getStatusCode(){
      return this.statusCode;
   }

   public void setErrorDescription(final java.lang.String errorDescription){
      this.errorDescription = errorDescription;
   }
   
   public void setError(final java.lang.String error){
      this.error = error;
   }
   
   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setErrors(final java.util.List<com.commercetools.models.error.ErrorObject> errors){
      this.errors = errors;
   }
   
   public void setStatusCode(final java.lang.Integer statusCode){
      this.statusCode = statusCode;
   }

}