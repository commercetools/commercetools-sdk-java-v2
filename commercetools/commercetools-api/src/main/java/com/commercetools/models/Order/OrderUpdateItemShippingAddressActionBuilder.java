package com.commercetools.models.order;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public OrderUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public OrderUpdateItemShippingAddressAction build() {
       return new OrderUpdateItemShippingAddressActionImpl(address);
   }
   
   public static OrderUpdateItemShippingAddressActionBuilder of() {
      return new OrderUpdateItemShippingAddressActionBuilder();
   }
   
   public static OrderUpdateItemShippingAddressActionBuilder of(final OrderUpdateItemShippingAddressAction template) {
      OrderUpdateItemShippingAddressActionBuilder builder = new OrderUpdateItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}