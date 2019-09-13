package com.commercetools.models.order_edit;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public StagedOrderAddItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public StagedOrderAddItemShippingAddressAction build() {
       return new StagedOrderAddItemShippingAddressActionImpl(address);
   }
   
   public static StagedOrderAddItemShippingAddressActionBuilder of() {
      return new StagedOrderAddItemShippingAddressActionBuilder();
   }
   
   public static StagedOrderAddItemShippingAddressActionBuilder of(final StagedOrderAddItemShippingAddressAction template) {
      StagedOrderAddItemShippingAddressActionBuilder builder = new StagedOrderAddItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}