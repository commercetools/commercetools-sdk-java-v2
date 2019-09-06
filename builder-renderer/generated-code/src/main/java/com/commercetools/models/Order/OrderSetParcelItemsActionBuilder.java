package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetParcelItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetParcelItemsActionBuilder {
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   
   private java.lang.String parcelId;
   
   public OrderSetParcelItemsActionBuilder items( final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public OrderSetParcelItemsActionBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public OrderSetParcelItemsAction build() {
       return new OrderSetParcelItemsActionImpl(items, parcelId);
   }
   
   public static OrderSetParcelItemsActionBuilder of() {
      return new OrderSetParcelItemsActionBuilder();
   }
   
   public static OrderSetParcelItemsActionBuilder of(final OrderSetParcelItemsAction template) {
      OrderSetParcelItemsActionBuilder builder = new OrderSetParcelItemsActionBuilder();
      builder.items = template.getItems();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}