package com.commercetools.models.message;

import com.commercetools.models.cart.LineItem;
import com.commercetools.models.message.MessagePayload;
import java.lang.Long;
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
public final class OrderLineItemAddedMessagePayloadImpl implements OrderLineItemAddedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.cart.LineItem lineItem;
   
   private java.lang.Long addedQuantity;

   @JsonCreator
   OrderLineItemAddedMessagePayloadImpl(@JsonProperty("lineItem") final com.commercetools.models.cart.LineItem lineItem, @JsonProperty("addedQuantity") final java.lang.Long addedQuantity) {
      this.lineItem = lineItem;
      this.addedQuantity = addedQuantity;
      this.type = "OrderLineItemAdded";
   }
   public OrderLineItemAddedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.cart.LineItem getLineItem(){
      return this.lineItem;
   }
   
   
   public java.lang.Long getAddedQuantity(){
      return this.addedQuantity;
   }

   public void setLineItem(final com.commercetools.models.cart.LineItem lineItem){
      this.lineItem = lineItem;
   }
   
   public void setAddedQuantity(final java.lang.Long addedQuantity){
      this.addedQuantity = addedQuantity;
   }

}