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
public final class RequiredFieldErrorImpl implements RequiredFieldError {

   private String code;
   
   private String message;
   
   private String field;

   @JsonCreator
   RequiredFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field) {
      this.message = message;
      this.field = field;
      this.code = "RequiredField";
   }
   public RequiredFieldErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public String getField(){
      return this.field;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setField(final String field){
      this.field = field;
   }

}