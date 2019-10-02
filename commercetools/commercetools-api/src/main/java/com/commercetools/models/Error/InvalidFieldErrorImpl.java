package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidFieldErrorImpl implements InvalidFieldError {

   private String code;
   
   private String message;
   
   private java.util.List<Object> allowedValues;
   
   private String field;
   
   private Object invalidValue;

   @JsonCreator
   InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("allowedValues") final java.util.List<Object> allowedValues, @JsonProperty("field") final String field, @JsonProperty("invalidValue") final Object invalidValue) {
      this.message = message;
      this.allowedValues = allowedValues;
      this.field = field;
      this.invalidValue = invalidValue;
      this.code = "InvalidField";
   }
   public InvalidFieldErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<Object> getAllowedValues(){
      return this.allowedValues;
   }
   
   
   public String getField(){
      return this.field;
   }
   
   
   public Object getInvalidValue(){
      return this.invalidValue;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setAllowedValues(final java.util.List<Object> allowedValues){
      this.allowedValues = allowedValues;
   }
   
   public void setField(final String field){
      this.field = field;
   }
   
   public void setInvalidValue(final Object invalidValue){
      this.invalidValue = invalidValue;
   }

}