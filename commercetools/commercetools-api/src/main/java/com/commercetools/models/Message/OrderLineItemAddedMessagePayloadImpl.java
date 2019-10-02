package com.commercetools.models.message;

import com.commercetools.models.cart.LineItem;
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
public final class OrderLineItemAddedMessagePayloadImpl implements OrderLineItemAddedMessagePayload {

   private String type;
   
   private com.commercetools.models.cart.LineItem lineItem;
   
   private Long addedQuantity;

   @JsonCreator
   OrderLineItemAddedMessagePayloadImpl(@JsonProperty("lineItem") final com.commercetools.models.cart.LineItem lineItem, @JsonProperty("addedQuantity") final Long addedQuantity) {
      this.lineItem = lineItem;
      this.addedQuantity = addedQuantity;
      this.type = "OrderLineItemAdded";
   }
   public OrderLineItemAddedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.cart.LineItem getLineItem(){
      return this.lineItem;
   }
   
   
   public Long getAddedQuantity(){
      return this.addedQuantity;
   }

   public void setLineItem(final com.commercetools.models.cart.LineItem lineItem){
      this.lineItem = lineItem;
   }
   
   public void setAddedQuantity(final Long addedQuantity){
      this.addedQuantity = addedQuantity;
   }

}