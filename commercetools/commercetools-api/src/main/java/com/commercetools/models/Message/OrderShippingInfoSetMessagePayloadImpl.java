package com.commercetools.models.message;

import com.commercetools.models.cart.ShippingInfo;
import com.commercetools.models.message.MessagePayload;
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
public final class OrderShippingInfoSetMessagePayloadImpl implements OrderShippingInfoSetMessagePayload {

   private String type;
   
   private com.commercetools.models.cart.ShippingInfo shippingInfo;
   
   private com.commercetools.models.cart.ShippingInfo oldShippingInfo;

   @JsonCreator
   OrderShippingInfoSetMessagePayloadImpl(@JsonProperty("shippingInfo") final com.commercetools.models.cart.ShippingInfo shippingInfo, @JsonProperty("oldShippingInfo") final com.commercetools.models.cart.ShippingInfo oldShippingInfo) {
      this.shippingInfo = shippingInfo;
      this.oldShippingInfo = oldShippingInfo;
      this.type = "OrderShippingInfoSet";
   }
   public OrderShippingInfoSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public com.commercetools.models.cart.ShippingInfo getOldShippingInfo(){
      return this.oldShippingInfo;
   }

   public void setShippingInfo(final com.commercetools.models.cart.ShippingInfo shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setOldShippingInfo(final com.commercetools.models.cart.ShippingInfo oldShippingInfo){
      this.oldShippingInfo = oldShippingInfo;
   }

}