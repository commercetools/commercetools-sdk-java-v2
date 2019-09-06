package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Delivery;
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
public final class DeliveryAddedMessagePayloadImpl implements DeliveryAddedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Order.Delivery delivery;

   @JsonCreator
   DeliveryAddedMessagePayloadImpl(@JsonProperty("delivery") final com.commercetools.models.Order.Delivery delivery) {
      this.delivery = delivery;
      this.type = "DeliveryAdded";
   }
   public DeliveryAddedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.Delivery getDelivery(){
      return this.delivery;
   }

   public void setDelivery(final com.commercetools.models.Order.Delivery delivery){
      this.delivery = delivery;
   }

}