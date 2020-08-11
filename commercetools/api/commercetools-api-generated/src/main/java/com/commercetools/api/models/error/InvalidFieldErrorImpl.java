package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidFieldErrorImpl implements InvalidFieldError {

   private String code;

   private String message;

   private java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues;

   private String field;

   private com.fasterxml.jackson.databind.JsonNode invalidValue;

   @JsonCreator
   InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("allowedValues") final java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues, @JsonProperty("field") final String field, @JsonProperty("invalidValue") final com.fasterxml.jackson.databind.JsonNode invalidValue) {
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


   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getAllowedValues(){
      return this.allowedValues;
   }


   public String getField(){
      return this.field;
   }


   public com.fasterxml.jackson.databind.JsonNode getInvalidValue(){
      return this.invalidValue;
   }

   public void setMessage(final String message){
      this.message = message;
   }

   public void setAllowedValues(final java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues){
      this.allowedValues = allowedValues;
   }

   public void setField(final String field){
      this.field = field;
   }

   public void setInvalidValue(final com.fasterxml.jackson.databind.JsonNode invalidValue){
      this.invalidValue = invalidValue;
   }

}
