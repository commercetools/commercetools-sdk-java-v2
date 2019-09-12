package com.commercetools.models.Order;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ParcelDraft;
import java.lang.String;
import com.commercetools.models.Order.OrderAddDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddDeliveryActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.ParcelDraft> parcels;
   
   public OrderAddDeliveryActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public OrderAddDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public OrderAddDeliveryActionBuilder parcels(@Nullable final java.util.List<com.commercetools.models.Order.ParcelDraft> parcels) {
      this.parcels = parcels;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.ParcelDraft> getParcels(){
      return this.parcels;
   }

   public OrderAddDeliveryAction build() {
       return new OrderAddDeliveryActionImpl(address, items, parcels);
   }
   
   public static OrderAddDeliveryActionBuilder of() {
      return new OrderAddDeliveryActionBuilder();
   }
   
   public static OrderAddDeliveryActionBuilder of(final OrderAddDeliveryAction template) {
      OrderAddDeliveryActionBuilder builder = new OrderAddDeliveryActionBuilder();
      builder.address = template.getAddress();
      builder.items = template.getItems();
      builder.parcels = template.getParcels();
      return builder;
   }
   
}