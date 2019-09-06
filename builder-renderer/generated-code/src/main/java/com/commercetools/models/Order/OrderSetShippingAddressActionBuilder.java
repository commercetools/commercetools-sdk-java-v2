package com.commercetools.models.Order;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public OrderSetShippingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public OrderSetShippingAddressAction build() {
       return new OrderSetShippingAddressActionImpl(address);
   }
   
   public static OrderSetShippingAddressActionBuilder of() {
      return new OrderSetShippingAddressActionBuilder();
   }
   
   public static OrderSetShippingAddressActionBuilder of(final OrderSetShippingAddressAction template) {
      OrderSetShippingAddressActionBuilder builder = new OrderSetShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}