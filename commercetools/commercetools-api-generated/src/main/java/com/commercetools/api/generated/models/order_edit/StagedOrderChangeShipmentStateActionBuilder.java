package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderChangeShipmentStateActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   public StagedOrderChangeShipmentStateActionBuilder shipmentState(@Nullable final com.commercetools.api.generated.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
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