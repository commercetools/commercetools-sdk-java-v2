package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ReturnShipmentState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetReturnShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetReturnShipmentStateActionBuilder {
   
   
   private com.commercetools.models.Order.ReturnShipmentState shipmentState;
   
   
   private java.lang.String returnItemId;
   
   public StagedOrderSetReturnShipmentStateActionBuilder shipmentState( final com.commercetools.models.Order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public StagedOrderSetReturnShipmentStateActionBuilder returnItemId( final java.lang.String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   
   public com.commercetools.models.Order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.lang.String getReturnItemId(){
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