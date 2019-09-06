package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ShipmentState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeShipmentStateActionBuilder {
   
   @Nullable
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   public StagedOrderChangeShipmentStateActionBuilder shipmentState(@Nullable final com.commercetools.models.Order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
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