package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderRemoveItemShippingAddressActionBuilder {
   
   
   private java.lang.String addressKey;
   
   public OrderRemoveItemShippingAddressActionBuilder addressKey( final java.lang.String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public OrderRemoveItemShippingAddressAction build() {
       return new OrderRemoveItemShippingAddressActionImpl(addressKey);
   }
   
   public static OrderRemoveItemShippingAddressActionBuilder of() {
      return new OrderRemoveItemShippingAddressActionBuilder();
   }
   
   public static OrderRemoveItemShippingAddressActionBuilder of(final OrderRemoveItemShippingAddressAction template) {
      OrderRemoveItemShippingAddressActionBuilder builder = new OrderRemoveItemShippingAddressActionBuilder();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}