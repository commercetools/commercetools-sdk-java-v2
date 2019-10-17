package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeShipmentStateActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeShipmentStateActionImpl.class)
public interface StagedOrderChangeShipmentStateAction extends StagedOrderUpdateAction {

   
   
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();

   public void setShipmentState(final ShipmentState shipmentState);
   
   public static StagedOrderChangeShipmentStateActionImpl of(){
      return new StagedOrderChangeShipmentStateActionImpl();
   }
   

   public static StagedOrderChangeShipmentStateActionImpl of(final StagedOrderChangeShipmentStateAction template) {
      StagedOrderChangeShipmentStateActionImpl instance = new StagedOrderChangeShipmentStateActionImpl();
      instance.setShipmentState(template.getShipmentState());
      return instance;
   }

}