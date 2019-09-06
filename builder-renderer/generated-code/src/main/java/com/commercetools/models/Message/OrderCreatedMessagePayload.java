package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.Order;
import java.lang.String;
import com.commercetools.models.Message.OrderCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderCreatedMessagePayloadImpl.class)
public interface OrderCreatedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("order")
   public Order getOrder();

   public void setOrder(final Order order);
   
   public static OrderCreatedMessagePayloadImpl of(){
      return new OrderCreatedMessagePayloadImpl();
   }
   

   public static OrderCreatedMessagePayloadImpl of(final OrderCreatedMessagePayload template) {
      OrderCreatedMessagePayloadImpl instance = new OrderCreatedMessagePayloadImpl();
      instance.setOrder(template.getOrder());
      return instance;
   }

}