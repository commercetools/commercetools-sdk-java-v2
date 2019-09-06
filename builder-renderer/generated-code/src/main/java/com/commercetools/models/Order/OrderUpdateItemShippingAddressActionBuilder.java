package com.commercetools.models.Order;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public OrderUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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