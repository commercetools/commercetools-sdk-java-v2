package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderLineItemAddedMessagePayloadImpl implements OrderLineItemAddedMessagePayload {

   private String type;

   private com.commercetools.api.models.cart.LineItem lineItem;

   private Long addedQuantity;

   @JsonCreator
   OrderLineItemAddedMessagePayloadImpl(@JsonProperty("lineItem") final com.commercetools.api.models.cart.LineItem lineItem, @JsonProperty("addedQuantity") final Long addedQuantity) {
      this.lineItem = lineItem;
      this.addedQuantity = addedQuantity;
      this.type = "OrderLineItemAdded";
   }
   public OrderLineItemAddedMessagePayloadImpl() {

   }


   public String getType(){
      return this.type;
   }


   public com.commercetools.api.models.cart.LineItem getLineItem(){
      return this.lineItem;
   }


   public Long getAddedQuantity(){
      return this.addedQuantity;
   }

   public void setLineItem(final com.commercetools.api.models.cart.LineItem lineItem){
      this.lineItem = lineItem;
   }

   public void setAddedQuantity(final Long addedQuantity){
      this.addedQuantity = addedQuantity;
   }

}
