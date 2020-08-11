package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>The response in case of an error.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorResponseImpl implements ErrorResponse {

   private Integer statusCode;
   
   private String message;
   
   private String error;
   
   private String errorDescription;
   
   private java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors;

   @JsonCreator
   ErrorResponseImpl(@JsonProperty("statusCode") final Integer statusCode, @JsonProperty("message") final String message, @JsonProperty("error") final String error, @JsonProperty("error_description") final String errorDescription, @JsonProperty("errors") final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors) {
      this.statusCode = statusCode;
      this.message = message;
      this.error = error;
      this.errorDescription = errorDescription;
      this.errors = errors;
   }
   public ErrorResponseImpl() {
      
   }
   
   /**
   *  <p>The http status code of the response.</p>
   */
   public Integer getStatusCode(){
      return this.statusCode;
   }
   
   /**
   *  <p>Describes the error.</p>
   */
   public String getMessage(){
      return this.message;
   }
   
   /**
   *  <p>This property is only used for OAuth2 errors.
   *  Contains the error code.</p>
   */
   public String getError(){
      return this.error;
   }
   
   /**
   *  <p>This property is only used for OAuth2 errors.
   *  Additional information to assist the client developer in
   *  understanding the error.</p>
   */
   public String getErrorDescription(){
      return this.errorDescription;
   }
   
   /**
   *  <p>The errors that caused this error response.</p>
   */
   public java.util.List<com.commercetools.importer.models.errors.ErrorObject> getErrors(){
      return this.errors;
   }

   public void setStatusCode(final Integer statusCode){
      this.statusCode = statusCode;
   }
   
   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setError(final String error){
      this.error = error;
   }
   
   public void setErrorDescription(final String errorDescription){
      this.errorDescription = errorDescription;
   }
   
   public void setErrors(final java.util.List<com.commercetools.importer.models.errors.ErrorObject> errors){
      this.errors = errors;
   }

}