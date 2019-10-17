package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
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

   private String code;
   
   private String message;

   @JsonCreator
   NoMatchingProductDiscountFoundErrorImpl(@JsonProperty("message") final String message) {
      this.message = message;
      this.code = "NoMatchingProductDiscountFound";
   }
   public NoMatchingProductDiscountFoundErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public void setMessage(final String message){
      this.message = message;
   }

}