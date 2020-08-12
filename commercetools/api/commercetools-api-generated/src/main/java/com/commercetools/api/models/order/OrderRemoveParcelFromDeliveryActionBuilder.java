package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderRemoveParcelFromDeliveryActionBuilder {
   
   
   private String parcelId;
   
   public OrderRemoveParcelFromDeliveryActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public OrderRemoveParcelFromDeliveryAction build() {
       return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
   }
   
   public static OrderRemoveParcelFromDeliveryActionBuilder of() {
      return new OrderRemoveParcelFromDeliveryActionBuilder();
   }
   
   public static OrderRemoveParcelFromDeliveryActionBuilder of(final OrderRemoveParcelFromDeliveryAction template) {
      OrderRemoveParcelFromDeliveryActionBuilder builder = new OrderRemoveParcelFromDeliveryActionBuilder();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}
