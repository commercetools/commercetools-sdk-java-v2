package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.Order;
import java.lang.String;
import com.commercetools.models.message.OrderImportedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderImportedMessagePayloadImpl.class)
public interface OrderImportedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("order")
   public Order getOrder();

   public void setOrder(final Order order);
   
   public static OrderImportedMessagePayloadImpl of(){
      return new OrderImportedMessagePayloadImpl();
   }
   

   public static OrderImportedMessagePayloadImpl of(final OrderImportedMessagePayload template) {
      OrderImportedMessagePayloadImpl instance = new OrderImportedMessagePayloadImpl();
      instance.setOrder(template.getOrder());
      return instance;
   }

}