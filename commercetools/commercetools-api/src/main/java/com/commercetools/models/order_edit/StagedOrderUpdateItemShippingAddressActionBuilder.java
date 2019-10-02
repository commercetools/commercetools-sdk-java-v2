package com.commercetools.models.order_edit;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public StagedOrderUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public StagedOrderUpdateItemShippingAddressAction build() {
       return new StagedOrderUpdateItemShippingAddressActionImpl(address);
   }
   
   public static StagedOrderUpdateItemShippingAddressActionBuilder of() {
      return new StagedOrderUpdateItemShippingAddressActionBuilder();
   }
   
   public static StagedOrderUpdateItemShippingAddressActionBuilder of(final StagedOrderUpdateItemShippingAddressAction template) {
      StagedOrderUpdateItemShippingAddressActionBuilder builder = new StagedOrderUpdateItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}