package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.DiscountCodeState;
import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDiscountCodeStateSetMessagePayloadImpl implements OrderDiscountCodeStateSetMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;
   
   private com.commercetools.api.generated.models.cart.DiscountCodeState oldState;
   
   private com.commercetools.api.generated.models.cart.DiscountCodeState state;

   @JsonCreator
   OrderDiscountCodeStateSetMessagePayloadImpl(@JsonProperty("discountCode") final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode, @JsonProperty("oldState") final com.commercetools.api.generated.models.cart.DiscountCodeState oldState, @JsonProperty("state") final com.commercetools.api.generated.models.cart.DiscountCodeState state) {
      this.discountCode = discountCode;
      this.oldState = oldState;
      this.state = state;
      this.type = "OrderDiscountCodeStateSet";
   }
   public OrderDiscountCodeStateSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }
   
   
   public com.commercetools.api.generated.models.cart.DiscountCodeState getOldState(){
      return this.oldState;
   }
   
   
   public com.commercetools.api.generated.models.cart.DiscountCodeState getState(){
      return this.state;
   }

   public void setDiscountCode(final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }
   
   public void setOldState(final com.commercetools.api.generated.models.cart.DiscountCodeState oldState){
      this.oldState = oldState;
   }
   
   public void setState(final com.commercetools.api.generated.models.cart.DiscountCodeState state){
      this.state = state;
   }

}