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
public final class OutOfStockErrorImpl implements OutOfStockError {

   private String code;
   
   private String message;
   
   private java.util.List<String> lineItems;
   
   private java.util.List<String> skus;

   @JsonCreator
   OutOfStockErrorImpl(@JsonProperty("message") final String message, @JsonProperty("lineItems") final java.util.List<String> lineItems, @JsonProperty("skus") final java.util.List<String> skus) {
      this.message = message;
      this.lineItems = lineItems;
      this.skus = skus;
      this.code = "OutOfStock";
   }
   public OutOfStockErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<String> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<String> getSkus(){
      return this.skus;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setLineItems(final java.util.List<String> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setSkus(final java.util.List<String> skus){
      this.skus = skus;
   }

}