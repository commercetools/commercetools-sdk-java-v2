package com.commercetools.models.Order;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public OrderAddItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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