package com.commercetools.models.Order;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetBillingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public OrderSetBillingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public OrderSetBillingAddressAction build() {
       return new OrderSetBillingAddressActionImpl(address);
   }
   
   public static OrderSetBillingAddressActionBuilder of() {
      return new OrderSetBillingAddressActionBuilder();
   }
   
   public static OrderSetBillingAddressActionBuilder of(final OrderSetBillingAddressAction template) {
      OrderSetBillingAddressActionBuilder builder = new OrderSetBillingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}