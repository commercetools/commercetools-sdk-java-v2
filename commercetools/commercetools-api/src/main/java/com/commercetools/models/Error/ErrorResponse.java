package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.error.ErrorResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ErrorResponseImpl.class)
public interface ErrorResponse  {

   
   @NotNull
   @JsonProperty("statusCode")
   public Integer getStatusCode();
   
   @NotNull
   @JsonProperty("message")
   public String getMessage();
   
   
   @JsonProperty("error")
   public String getError();
   
   
   @JsonProperty("error_description")
   public String getErrorDescription();
   
   @Valid
   @JsonProperty("errors")
   public List<ErrorObject> getErrors();

   public void setStatusCode(final Integer statusCode);
   
   public void setMessage(final String message);
   
   public void setError(final String error);
   
   public void setErrorDescription(final String errorDescription);
   
   public void setErrors(final List<ErrorObject> errors);
   
   public static ErrorResponseImpl of(){
      return new ErrorResponseImpl();
   }
   

   public static ErrorResponseImpl of(final ErrorResponse template) {
      ErrorResponseImpl instance = new ErrorResponseImpl();
      instance.setErrorDescription(template.getErrorDescription());
      instance.setError(template.getError());
      instance.setMessage(template.getMessage());
      instance.setErrors(template.getErrors());
      instance.setStatusCode(template.getStatusCode());
      return instance;
   }

}