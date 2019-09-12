package com.commercetools.models.Message;

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
public final class OrderDiscountCodeAddedMessagePayloadImpl implements OrderDiscountCodeAddedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;

   @JsonCreator
   OrderDiscountCodeAddedMessagePayloadImpl(@JsonProperty("discountCode") final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      this.type = "OrderDiscountCodeAdded";
   }
   public OrderDiscountCodeAddedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public void setDiscountCode(final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode){
      this.discountCode = discountCode;
   }

}