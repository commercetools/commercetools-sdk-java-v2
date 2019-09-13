package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderRemoveDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderRemoveDeliveryActionBuilder {
   
   
   private java.lang.String deliveryId;
   
   public OrderRemoveDeliveryActionBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
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