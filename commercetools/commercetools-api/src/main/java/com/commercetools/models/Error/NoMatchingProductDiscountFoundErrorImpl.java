package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
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
public final class NoMatchingProductDiscountFoundErrorImpl implements NoMatchingProductDiscountFoundError {

   private java.lang.String code;
   
   private java.lang.String message;

   @JsonCreator
   NoMatchingProductDiscountFoundErrorImpl(@JsonProperty("message") final java.lang.String message) {
      this.message = message;
      this.code = "NoMatchingProductDiscountFound";
   }
   public NoMatchingProductDiscountFoundErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }

}