package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetBillingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   public StagedOrderSetBillingAddressActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
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