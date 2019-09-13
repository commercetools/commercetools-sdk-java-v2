package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderRemoveParcelFromDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderRemoveParcelFromDeliveryActionBuilder {
   
   
   private java.lang.String parcelId;
   
   public OrderRemoveParcelFromDeliveryActionBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.lang.String getParcelId(){
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