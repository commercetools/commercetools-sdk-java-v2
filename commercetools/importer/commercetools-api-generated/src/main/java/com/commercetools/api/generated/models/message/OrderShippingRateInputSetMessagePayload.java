package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderShippingRateInputSetMessagePayloadImpl.class)
public interface OrderShippingRateInputSetMessagePayload extends MessagePayload {

   
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInput getShippingRateInput();
   
   @Valid
   @JsonProperty("oldShippingRateInput")
   public ShippingRateInput getOldShippingRateInput();

   public void setShippingRateInput(final ShippingRateInput shippingRateInput);
   
   public void setOldShippingRateInput(final ShippingRateInput oldShippingRateInput);
   
   public static OrderShippingRateInputSetMessagePayloadImpl of(){
      return new OrderShippingRateInputSetMessagePayloadImpl();
   }
   

   public static OrderShippingRateInputSetMessagePayloadImpl of(final OrderShippingRateInputSetMessagePayload template) {
      OrderShippingRateInputSetMessagePayloadImpl instance = new OrderShippingRateInputSetMessagePayloadImpl();
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setOldShippingRateInput(template.getOldShippingRateInput());
      return instance;
   }

}