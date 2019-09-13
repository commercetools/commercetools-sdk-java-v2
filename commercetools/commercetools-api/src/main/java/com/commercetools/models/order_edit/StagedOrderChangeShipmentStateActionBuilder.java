package com.commercetools.models.order_edit;

import com.commercetools.models.order.ShipmentState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderChangeShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeShipmentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.order.ShipmentState shipmentState;
   
   public StagedOrderChangeShipmentStateActionBuilder shipmentState(@Nullable final com.commercetools.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }

   public StagedOrderChangeShipmentStateAction build() {
       return new StagedOrderChangeShipmentStateActionImpl(shipmentState);
   }
   
   public static StagedOrderChangeShipmentStateActionBuilder of() {
      return new StagedOrderChangeShipmentStateActionBuilder();
   }
   
   public static StagedOrderChangeShipmentStateActionBuilder of(final StagedOrderChangeShipmentStateAction template) {
      StagedOrderChangeShipmentStateActionBuilder builder = new StagedOrderChangeShipmentStateActionBuilder();
      builder.shipmentState = template.getShipmentState();
      return builder;
   }
   
}