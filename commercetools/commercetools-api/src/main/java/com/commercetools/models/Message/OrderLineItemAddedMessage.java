package com.commercetools.models.message;

import com.commercetools.models.cart.LineItem;
import com.commercetools.models.message.Message;
import java.lang.Long;
import com.commercetools.models.message.OrderLineItemAddedMessageImpl;

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
@JsonDeserialize(as = OrderLineItemAddedMessageImpl.class)
public interface OrderLineItemAddedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("lineItem")
   public LineItem getLineItem();
   
   @NotNull
   @JsonProperty("addedQuantity")
   public Long getAddedQuantity();

   public void setLineItem(final LineItem lineItem);
   
   public void setAddedQuantity(final Long addedQuantity);
   
   public static OrderLineItemAddedMessageImpl of(){
      return new OrderLineItemAddedMessageImpl();
   }
   

   public static OrderLineItemAddedMessageImpl of(final OrderLineItemAddedMessage template) {
      OrderLineItemAddedMessageImpl instance = new OrderLineItemAddedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setLineItem(template.getLineItem());
      instance.setAddedQuantity(template.getAddedQuantity());
      return instance;
   }

}