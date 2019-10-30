package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.LineItem;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderLineItemAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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