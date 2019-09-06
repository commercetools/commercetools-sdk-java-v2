package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Message.OrderStateChangedMessageImpl;

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
@JsonDeserialize(as = OrderStateChangedMessageImpl.class)
public interface OrderStateChangedMessage extends Message {

   
   @NotNull
   @JsonProperty("orderState")
   public OrderState getOrderState();
   
   @NotNull
   @JsonProperty("oldOrderState")
   public OrderState getOldOrderState();

   public void setOrderState(final OrderState orderState);
   
   public void setOldOrderState(final OrderState oldOrderState);
   
   public static OrderStateChangedMessageImpl of(){
      return new OrderStateChangedMessageImpl();
   }
   

   public static OrderStateChangedMessageImpl of(final OrderStateChangedMessage template) {
      OrderStateChangedMessageImpl instance = new OrderStateChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setOldOrderState(template.getOldOrderState());
      instance.setOrderState(template.getOrderState());
      return instance;
   }

}