package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ReturnShipmentState;
import com.commercetools.api.generated.models.order.OrderSetReturnShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetReturnShipmentStateActionBuilder {
   
   
   private com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState;
   
   
   private String returnItemId;
   
   public OrderSetReturnShipmentStateActionBuilder shipmentState( final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderSetReturnShipmentStateActionBuilder returnItemId( final String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }

   public OrderSetReturnShipmentStateAction build() {
       return new OrderSetReturnShipmentStateActionImpl(shipmentState, returnItemId);
   }
   
   public static OrderSetReturnShipmentStateActionBuilder of() {
      return new OrderSetReturnShipmentStateActionBuilder();
   }
   
   public static OrderSetReturnShipmentStateActionBuilder of(final OrderSetReturnShipmentStateAction template) {
      OrderSetReturnShipmentStateActionBuilder builder = new OrderSetReturnShipmentStateActionBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.returnItemId = template.getReturnItemId();
      return builder;
   }
   
}