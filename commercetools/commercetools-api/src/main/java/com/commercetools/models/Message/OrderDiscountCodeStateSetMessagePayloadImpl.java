package com.commercetools.models.Message;

import com.commercetools.models.Cart.DiscountCodeState;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
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
public final class OrderDiscountCodeStateSetMessagePayloadImpl implements OrderDiscountCodeStateSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   private com.commercetools.models.Cart.DiscountCodeState oldState;
   
   private com.commercetools.models.Cart.DiscountCodeState state;

   @JsonCreator
   OrderDiscountCodeStateSetMessagePayloadImpl(@JsonProperty("discountCode") final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode, @JsonProperty("oldState") final com.commercetools.models.Cart.DiscountCodeState oldState, @JsonProperty("state") final com.commercetools.models.Cart.DiscountCodeState state) {
      this.discountCode = discountCode;
      this.oldState = oldState;
      this.state = state;
      this.type = "OrderDiscountCodeStateSet";
   }
   public OrderDiscountCodeStateSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   
   public com.commercetools.models.Cart.DiscountCodeState getOldState(){
      return this.oldState;
   }
   
   
   public com.commercetools.models.Cart.DiscountCodeState getState(){
      return this.state;
   }

   public void setDiscountCode(final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }
   
   public void setOldState(final com.commercetools.models.Cart.DiscountCodeState oldState){
      this.oldState = oldState;
   }
   
   public void setState(final com.commercetools.models.Cart.DiscountCodeState state){
      this.state = state;
   }

}