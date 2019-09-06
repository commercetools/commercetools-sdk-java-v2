package com.commercetools.models.Message;

import com.commercetools.models.Cart.ShippingInfo;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderShippingInfoSetMessagePayloadImpl implements OrderShippingInfoSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Cart.ShippingInfo shippingInfo;
   
   private com.commercetools.models.Cart.ShippingInfo oldShippingInfo;

   @JsonCreator
   OrderShippingInfoSetMessagePayloadImpl(@JsonProperty("shippingInfo") final com.commercetools.models.Cart.ShippingInfo shippingInfo, @JsonProperty("oldShippingInfo") final com.commercetools.models.Cart.ShippingInfo oldShippingInfo) {
      this.shippingInfo = shippingInfo;
      this.oldShippingInfo = oldShippingInfo;
      this.type = "OrderShippingInfoSet";
   }
   public OrderShippingInfoSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public com.commercetools.models.Cart.ShippingInfo getOldShippingInfo(){
      return this.oldShippingInfo;
   }

   public void setShippingInfo(final com.commercetools.models.Cart.ShippingInfo shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setOldShippingInfo(final com.commercetools.models.Cart.ShippingInfo oldShippingInfo){
      this.oldShippingInfo = oldShippingInfo;
   }

}