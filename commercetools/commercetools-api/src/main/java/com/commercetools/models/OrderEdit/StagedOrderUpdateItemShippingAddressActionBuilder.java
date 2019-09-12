package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public StagedOrderUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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