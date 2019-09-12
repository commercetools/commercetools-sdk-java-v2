package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public MyCartAddItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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