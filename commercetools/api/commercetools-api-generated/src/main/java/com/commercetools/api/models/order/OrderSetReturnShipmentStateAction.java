package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.OrderSetReturnShipmentStateActionImpl;

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
@JsonDeserialize(as = OrderSetReturnShipmentStateActionImpl.class)
public interface OrderSetReturnShipmentStateAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("returnItemId")
   public String getReturnItemId();
   
   @NotNull
   @JsonProperty("shipmentState")
   public ReturnShipmentState getShipmentState();

   public void setReturnItemId(final String returnItemId);
   
   public void setShipmentState(final ReturnShipmentState shipmentState);
   
   public static OrderSetReturnShipmentStateActionImpl of(){
      return new OrderSetReturnShipmentStateActionImpl();
   }
   

   public static OrderSetReturnShipmentStateActionImpl of(final OrderSetReturnShipmentStateAction template) {
      OrderSetReturnShipmentStateActionImpl instance = new OrderSetReturnShipmentStateActionImpl();
      instance.setReturnItemId(template.getReturnItemId());
      instance.setShipmentState(template.getShipmentState());
      return instance;
   }

}
