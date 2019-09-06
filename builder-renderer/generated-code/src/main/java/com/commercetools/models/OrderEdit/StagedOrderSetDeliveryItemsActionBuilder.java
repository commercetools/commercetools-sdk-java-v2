package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetDeliveryItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetDeliveryItemsActionBuilder {
   
   
   private java.lang.String deliveryId;
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   public StagedOrderSetDeliveryItemsActionBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public StagedOrderSetDeliveryItemsActionBuilder items( final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }

   public StagedOrderSetDeliveryItemsAction build() {
       return new StagedOrderSetDeliveryItemsActionImpl(deliveryId, items);
   }
   
   public static StagedOrderSetDeliveryItemsActionBuilder of() {
      return new StagedOrderSetDeliveryItemsActionBuilder();
   }
   
   public static StagedOrderSetDeliveryItemsActionBuilder of(final StagedOrderSetDeliveryItemsAction template) {
      StagedOrderSetDeliveryItemsActionBuilder builder = new StagedOrderSetDeliveryItemsActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.items = template.getItems();
      return builder;
   }
   
}