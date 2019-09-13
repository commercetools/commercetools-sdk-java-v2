package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerAddAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerAddAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public MyCustomerAddAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public MyCustomerAddAddressAction build() {
       return new MyCustomerAddAddressActionImpl(address);
   }
   
   public static MyCustomerAddAddressActionBuilder of() {
      return new MyCustomerAddAddressActionBuilder();
   }
   
   public static MyCustomerAddAddressActionBuilder of(final MyCustomerAddAddressAction template) {
      MyCustomerAddAddressActionBuilder builder = new MyCustomerAddAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}