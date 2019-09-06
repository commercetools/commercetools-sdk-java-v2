package com.commercetools.models.Customer;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerAddAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public CustomerAddAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public CustomerAddAddressAction build() {
       return new CustomerAddAddressActionImpl(address);
   }
   
   public static CustomerAddAddressActionBuilder of() {
      return new CustomerAddAddressActionBuilder();
   }
   
   public static CustomerAddAddressActionBuilder of(final CustomerAddAddressAction template) {
      CustomerAddAddressActionBuilder builder = new CustomerAddAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}