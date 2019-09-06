package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public StagedOrderSetShippingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public StagedOrderSetShippingAddressAction build() {
       return new StagedOrderSetShippingAddressActionImpl(address);
   }
   
   public static StagedOrderSetShippingAddressActionBuilder of() {
      return new StagedOrderSetShippingAddressActionBuilder();
   }
   
   public static StagedOrderSetShippingAddressActionBuilder of(final StagedOrderSetShippingAddressAction template) {
      StagedOrderSetShippingAddressActionBuilder builder = new StagedOrderSetShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}