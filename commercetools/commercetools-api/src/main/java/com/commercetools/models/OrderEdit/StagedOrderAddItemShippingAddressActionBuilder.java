package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public StagedOrderAddItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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