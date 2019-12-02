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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>A field has an invalid value.</p>
*/
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
   
   /**
   *  <p>The error's description.</p>
   */
   public String getMessage(){
      return this.message;
   }
   
   /**
   *  <p>A fixed set of allowed values for the field, if any.</p>
   */
   public java.util.List<Object> getAllowedValues(){
      return this.allowedValues;
   }
   
   /**
   *  <p>The name of the field.</p>
   */
   public String getField(){
      return this.field;
   }
   
   /**
   *  <p>The invalid value.</p>
   */
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