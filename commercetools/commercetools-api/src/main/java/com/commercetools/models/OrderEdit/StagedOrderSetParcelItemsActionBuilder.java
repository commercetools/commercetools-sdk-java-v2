package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetParcelItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetParcelItemsActionBuilder {
   
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   
   private java.lang.String parcelId;
   
   public StagedOrderSetParcelItemsActionBuilder items( final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public StagedOrderSetParcelItemsActionBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public StagedOrderSetParcelItemsAction build() {
       return new StagedOrderSetParcelItemsActionImpl(items, parcelId);
   }
   
   public static StagedOrderSetParcelItemsActionBuilder of() {
      return new StagedOrderSetParcelItemsActionBuilder();
   }
   
   public static StagedOrderSetParcelItemsActionBuilder of(final StagedOrderSetParcelItemsAction template) {
      StagedOrderSetParcelItemsActionBuilder builder = new StagedOrderSetParcelItemsActionBuilder();
      builder.items = template.getItems();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}