package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.ParcelDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddDeliveryActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.ParcelDraft> parcels;
   
   public StagedOrderAddDeliveryActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public StagedOrderAddDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public StagedOrderAddDeliveryActionBuilder parcels(@Nullable final java.util.List<com.commercetools.models.Order.ParcelDraft> parcels) {
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

   public StagedOrderAddDeliveryAction build() {
       return new StagedOrderAddDeliveryActionImpl(address, items, parcels);
   }
   
   public static StagedOrderAddDeliveryActionBuilder of() {
      return new StagedOrderAddDeliveryActionBuilder();
   }
   
   public static StagedOrderAddDeliveryActionBuilder of(final StagedOrderAddDeliveryAction template) {
      StagedOrderAddDeliveryActionBuilder builder = new StagedOrderAddDeliveryActionBuilder();
      builder.address = template.getAddress();
      builder.items = template.getItems();
      builder.parcels = template.getParcels();
      return builder;
   }
   
}