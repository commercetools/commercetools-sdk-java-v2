package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetParcelItemsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetParcelItemsActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   
   private String parcelId;
   
   public OrderSetParcelItemsActionBuilder items( final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public OrderSetParcelItemsActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public String getParcelId(){
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