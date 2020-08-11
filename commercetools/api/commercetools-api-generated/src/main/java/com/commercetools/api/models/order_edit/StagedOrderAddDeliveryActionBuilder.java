package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderAddDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddDeliveryActionBuilder {

   @Nullable
   private com.commercetools.api.models.common.Address address;

   @Nullable
   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

   @Nullable
   private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

   public StagedOrderAddDeliveryActionBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }

   public StagedOrderAddDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }

   public StagedOrderAddDeliveryActionBuilder parcels(@Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
      this.parcels = parcels;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels(){
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
