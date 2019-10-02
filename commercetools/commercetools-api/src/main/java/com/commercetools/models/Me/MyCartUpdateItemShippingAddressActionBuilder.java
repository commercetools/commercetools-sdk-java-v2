package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.me.MyCartUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public MyCartUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
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