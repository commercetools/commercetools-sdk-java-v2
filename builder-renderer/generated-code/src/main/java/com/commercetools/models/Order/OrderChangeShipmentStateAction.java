package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ShipmentState;
import java.lang.String;
import com.commercetools.models.Order.OrderChangeShipmentStateActionImpl;

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
@JsonDeserialize(as = OrderChangeShipmentStateActionImpl.class)
public interface OrderChangeShipmentStateAction extends OrderUpdateAction {

   
   
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();

   public void setShipmentState(final ShipmentState shipmentState);
   
   public static OrderChangeShipmentStateActionImpl of(){
      return new OrderChangeShipmentStateActionImpl();
   }
   

   public static OrderChangeShipmentStateActionImpl of(final OrderChangeShipmentStateAction template) {
      OrderChangeShipmentStateActionImpl instance = new OrderChangeShipmentStateActionImpl();
      instance.setShipmentState(template.getShipmentState());
      return instance;
   }

}