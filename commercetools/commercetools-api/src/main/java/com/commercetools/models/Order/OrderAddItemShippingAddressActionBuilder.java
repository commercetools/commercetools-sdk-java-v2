package com.commercetools.models.order;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public OrderAddItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public OrderAddItemShippingAddressAction build() {
       return new OrderAddItemShippingAddressActionImpl(address);
   }
   
   public static OrderAddItemShippingAddressActionBuilder of() {
      return new OrderAddItemShippingAddressActionBuilder();
   }
   
   public static OrderAddItemShippingAddressActionBuilder of(final OrderAddItemShippingAddressAction template) {
      OrderAddItemShippingAddressActionBuilder builder = new OrderAddItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}