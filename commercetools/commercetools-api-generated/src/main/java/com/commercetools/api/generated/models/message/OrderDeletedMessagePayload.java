package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.message.OrderDeletedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderDeletedMessagePayloadImpl.class)
public interface OrderDeletedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("order")
   public Order getOrder();

   public void setOrder(final Order order);
   
   public static OrderDeletedMessagePayloadImpl of(){
      return new OrderDeletedMessagePayloadImpl();
   }
   

   public static OrderDeletedMessagePayloadImpl of(final OrderDeletedMessagePayload template) {
      OrderDeletedMessagePayloadImpl instance = new OrderDeletedMessagePayloadImpl();
      instance.setOrder(template.getOrder());
      return instance;
   }

}