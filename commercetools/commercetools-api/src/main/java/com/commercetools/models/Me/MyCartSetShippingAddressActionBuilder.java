package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.me.MyCartSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.Address address;
   
   public MyCartSetShippingAddressActionBuilder address(@Nullable final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public MyCartSetShippingAddressAction build() {
       return new MyCartSetShippingAddressActionImpl(address);
   }
   
   public static MyCartSetShippingAddressActionBuilder of() {
      return new MyCartSetShippingAddressActionBuilder();
   }
   
   public static MyCartSetShippingAddressActionBuilder of(final MyCartSetShippingAddressAction template) {
      MyCartSetShippingAddressActionBuilder builder = new MyCartSetShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}