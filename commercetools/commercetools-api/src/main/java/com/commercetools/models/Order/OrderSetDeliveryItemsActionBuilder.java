package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetDeliveryItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetDeliveryItemsActionBuilder {
   
   
   private java.lang.String deliveryId;
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   public OrderSetDeliveryItemsActionBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public OrderSetDeliveryItemsActionBuilder items( final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
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