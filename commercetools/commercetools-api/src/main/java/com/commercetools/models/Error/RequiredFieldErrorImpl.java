package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class RequiredFieldErrorImpl implements RequiredFieldError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.lang.String field;

   @JsonCreator
   RequiredFieldErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("field") final java.lang.String field) {
      this.message = message;
      this.field = field;
      this.code = "RequiredField";
   }
   public RequiredFieldErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getField(){
      return this.field;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setField(final java.lang.String field){
      this.field = field;
   }

}