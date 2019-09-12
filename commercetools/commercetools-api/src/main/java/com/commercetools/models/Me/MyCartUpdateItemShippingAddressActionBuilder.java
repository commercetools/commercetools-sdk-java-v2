package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public MyCartUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public MyCartUpdateItemShippingAddressAction build() {
       return new MyCartUpdateItemShippingAddressActionImpl(address);
   }
   
   public static MyCartUpdateItemShippingAddressActionBuilder of() {
      return new MyCartUpdateItemShippingAddressActionBuilder();
   }
   
   public static MyCartUpdateItemShippingAddressActionBuilder of(final MyCartUpdateItemShippingAddressAction template) {
      MyCartUpdateItemShippingAddressActionBuilder builder = new MyCartUpdateItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}