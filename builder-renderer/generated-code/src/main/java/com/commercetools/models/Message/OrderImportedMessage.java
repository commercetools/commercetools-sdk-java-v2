package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.Order;
import com.commercetools.models.Message.OrderImportedMessageImpl;

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
@JsonDeserialize(as = OrderImportedMessageImpl.class)
public interface OrderImportedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("order")
   public Order getOrder();

   public void setOrder(final Order order);
   
   public static OrderImportedMessageImpl of(){
      return new OrderImportedMessageImpl();
   }
   

   public static OrderImportedMessageImpl of(final OrderImportedMessage template) {
      OrderImportedMessageImpl instance = new OrderImportedMessageImpl();
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