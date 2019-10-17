package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderRemoveDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderRemoveDeliveryActionBuilder {
   
   
   private String deliveryId;
   
   public OrderRemoveDeliveryActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }

   public OrderRemoveDeliveryAction build() {
       return new OrderRemoveDeliveryActionImpl(deliveryId);
   }
   
   public static OrderRemoveDeliveryActionBuilder of() {
      return new OrderRemoveDeliveryActionBuilder();
   }
   
   public static OrderRemoveDeliveryActionBuilder of(final OrderRemoveDeliveryAction template) {
      OrderRemoveDeliveryActionBuilder builder = new OrderRemoveDeliveryActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      return builder;
   }
   
}