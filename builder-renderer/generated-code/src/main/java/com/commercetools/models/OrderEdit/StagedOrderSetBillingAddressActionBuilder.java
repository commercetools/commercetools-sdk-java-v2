package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetBillingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public StagedOrderSetBillingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public StagedOrderSetBillingAddressAction build() {
       return new StagedOrderSetBillingAddressActionImpl(address);
   }
   
   public static StagedOrderSetBillingAddressActionBuilder of() {
      return new StagedOrderSetBillingAddressActionBuilder();
   }
   
   public static StagedOrderSetBillingAddressActionBuilder of(final StagedOrderSetBillingAddressAction template) {
      StagedOrderSetBillingAddressActionBuilder builder = new StagedOrderSetBillingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}