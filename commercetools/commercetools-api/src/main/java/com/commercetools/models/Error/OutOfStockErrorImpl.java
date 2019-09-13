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
public final class OutOfStockErrorImpl implements OutOfStockError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.util.List<java.lang.String> lineItems;
   
   private java.util.List<java.lang.String> skus;

   @JsonCreator
   OutOfStockErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("lineItems") final java.util.List<java.lang.String> lineItems, @JsonProperty("skus") final java.util.List<java.lang.String> skus) {
      this.message = message;
      this.lineItems = lineItems;
      this.skus = skus;
      this.code = "OutOfStock";
   }
   public OutOfStockErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<java.lang.String> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<java.lang.String> getSkus(){
      return this.skus;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setLineItems(final java.util.List<java.lang.String> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setSkus(final java.util.List<java.lang.String> skus){
      this.skus = skus;
   }

}