package com.commercetools.models.order;

import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderSetDeliveryItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetDeliveryItemsActionBuilder {
   
   
   private String deliveryId;
   
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> items;
   
   public OrderSetDeliveryItemsActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public OrderSetDeliveryItemsActionBuilder items( final java.util.List<com.commercetools.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public OrderSetDeliveryItemsAction build() {
       return new OrderSetDeliveryItemsActionImpl(deliveryId, items);
   }
   
   public static OrderSetDeliveryItemsActionBuilder of() {
      return new OrderSetDeliveryItemsActionBuilder();
   }
   
   public static OrderSetDeliveryItemsActionBuilder of(final OrderSetDeliveryItemsAction template) {
      OrderSetDeliveryItemsActionBuilder builder = new OrderSetDeliveryItemsActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.items = template.getItems();
      return builder;
   }
   
}