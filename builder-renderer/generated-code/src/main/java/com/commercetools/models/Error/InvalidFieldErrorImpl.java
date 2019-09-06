package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidFieldErrorImpl implements InvalidFieldError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.util.List<java.lang.Object> allowedValues;
   
   private java.lang.String field;
   
   private java.lang.Object invalidValue;

   @JsonCreator
   InvalidFieldErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("allowedValues") final java.util.List<java.lang.Object> allowedValues, @JsonProperty("field") final java.lang.String field, @JsonProperty("invalidValue") final java.lang.Object invalidValue) {
      this.message = message;
      this.allowedValues = allowedValues;
      this.field = field;
      this.invalidValue = invalidValue;
      this.code = "InvalidField";
   }
   public InvalidFieldErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<java.lang.Object> getAllowedValues(){
      return this.allowedValues;
   }
   
   
   public java.lang.String getField(){
      return this.field;
   }
   
   
   public java.lang.Object getInvalidValue(){
      return this.invalidValue;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setAllowedValues(final java.util.List<java.lang.Object> allowedValues){
      this.allowedValues = allowedValues;
   }
   
   public void setField(final java.lang.String field){
      this.field = field;
   }
   
   public void setInvalidValue(final java.lang.Object invalidValue){
      this.invalidValue = invalidValue;
   }

}