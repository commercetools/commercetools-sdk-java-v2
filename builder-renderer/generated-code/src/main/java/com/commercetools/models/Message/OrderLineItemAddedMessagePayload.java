package com.commercetools.models.Message;

import com.commercetools.models.Cart.LineItem;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Message.OrderLineItemAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderLineItemAddedMessagePayloadImpl.class)
public interface OrderLineItemAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("lineItem")
   public LineItem getLineItem();
   
   @NotNull
   @JsonProperty("addedQuantity")
   public Long getAddedQuantity();

   public void setLineItem(final LineItem lineItem);
   
   public void setAddedQuantity(final Long addedQuantity);
   
   public static OrderLineItemAddedMessagePayloadImpl of(){
      return new OrderLineItemAddedMessagePayloadImpl();
   }
   

   public static OrderLineItemAddedMessagePayloadImpl of(final OrderLineItemAddedMessagePayload template) {
      OrderLineItemAddedMessagePayloadImpl instance = new OrderLineItemAddedMessagePayloadImpl();
      instance.setLineItem(template.getLineItem());
      instance.setAddedQuantity(template.getAddedQuantity());
      return instance;
   }

}