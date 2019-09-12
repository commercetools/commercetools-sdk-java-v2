package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public MyCartSetShippingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
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