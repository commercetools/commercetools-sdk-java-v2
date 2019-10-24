package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ParcelDraft;
import com.commercetools.api.generated.models.order.OrderAddDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddDeliveryActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> parcels;
   
   public OrderAddDeliveryActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public OrderAddDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public OrderAddDeliveryActionBuilder parcels(@Nullable final java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> parcels) {
      this.parcels = parcels;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> getParcels(){
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