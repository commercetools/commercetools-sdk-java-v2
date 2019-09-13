package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.Order;
import com.commercetools.models.message.OrderCreatedMessageImpl;

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
@JsonDeserialize(as = OrderCreatedMessageImpl.class)
public interface OrderCreatedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("order")
   public Order getOrder();

   public void setOrder(final Order order);
   
   public static OrderCreatedMessageImpl of(){
      return new OrderCreatedMessageImpl();
   }
   

   public static OrderCreatedMessageImpl of(final OrderCreatedMessage template) {
      OrderCreatedMessageImpl instance = new OrderCreatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setOrder(template.getOrder());
      return instance;
   }

}