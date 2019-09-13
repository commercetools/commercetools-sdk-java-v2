package com.commercetools.models.order;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetDeliveryAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetDeliveryAddressActionBuilder {
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.common.Address address;
   
   public OrderSetDeliveryAddressActionBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public OrderSetDeliveryAddressActionBuilder address(@Nullable final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public OrderSetDeliveryAddressAction build() {
       return new OrderSetDeliveryAddressActionImpl(deliveryId, address);
   }
   
   public static OrderSetDeliveryAddressActionBuilder of() {
      return new OrderSetDeliveryAddressActionBuilder();
   }
   
   public static OrderSetDeliveryAddressActionBuilder of(final OrderSetDeliveryAddressAction template) {
      OrderSetDeliveryAddressActionBuilder builder = new OrderSetDeliveryAddressActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.address = template.getAddress();
      return builder;
   }
   
}