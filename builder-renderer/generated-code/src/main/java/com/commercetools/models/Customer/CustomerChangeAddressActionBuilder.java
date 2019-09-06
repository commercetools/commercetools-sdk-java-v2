package com.commercetools.models.Customer;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerChangeAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerChangeAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   
   private java.lang.String addressId;
   
   public CustomerChangeAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public CustomerChangeAddressActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerChangeAddressAction build() {
       return new CustomerChangeAddressActionImpl(address, addressId);
   }
   
   public static CustomerChangeAddressActionBuilder of() {
      return new CustomerChangeAddressActionBuilder();
   }
   
   public static CustomerChangeAddressActionBuilder of(final CustomerChangeAddressAction template) {
      CustomerChangeAddressActionBuilder builder = new CustomerChangeAddressActionBuilder();
      builder.address = template.getAddress();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}