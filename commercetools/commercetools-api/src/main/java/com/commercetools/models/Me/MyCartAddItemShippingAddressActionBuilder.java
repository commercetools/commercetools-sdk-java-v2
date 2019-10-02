package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.me.MyCartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public MyCartAddItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public MyCartAddItemShippingAddressAction build() {
       return new MyCartAddItemShippingAddressActionImpl(address);
   }
   
   public static MyCartAddItemShippingAddressActionBuilder of() {
      return new MyCartAddItemShippingAddressActionBuilder();
   }
   
   public static MyCartAddItemShippingAddressActionBuilder of(final MyCartAddItemShippingAddressAction template) {
      MyCartAddItemShippingAddressActionBuilder builder = new MyCartAddItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}