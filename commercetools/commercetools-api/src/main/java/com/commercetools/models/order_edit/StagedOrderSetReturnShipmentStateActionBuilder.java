package com.commercetools.models.order_edit;

import com.commercetools.models.order.ReturnShipmentState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetReturnShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetReturnShipmentStateActionBuilder {
   
   
   private com.commercetools.models.order.ReturnShipmentState shipmentState;
   
   
   private String returnItemId;
   
   public StagedOrderSetReturnShipmentStateActionBuilder shipmentState( final com.commercetools.models.order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public StagedOrderSetReturnShipmentStateActionBuilder returnItemId( final String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   
   public com.commercetools.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }

   public StagedOrderSetReturnShipmentStateAction build() {
       return new StagedOrderSetReturnShipmentStateActionImpl(shipmentState, returnItemId);
   }
   
   public static StagedOrderSetReturnShipmentStateActionBuilder of() {
      return new StagedOrderSetReturnShipmentStateActionBuilder();
   }
   
   public static StagedOrderSetReturnShipmentStateActionBuilder of(final StagedOrderSetReturnShipmentStateAction template) {
      StagedOrderSetReturnShipmentStateActionBuilder builder = new StagedOrderSetReturnShipmentStateActionBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.returnItemId = template.getReturnItemId();
      return builder;
   }
   
}