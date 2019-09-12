package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetDefaultShippingAddressActionBuilder {
   
   @Nullable
   private java.lang.String addressId;
   
   public CustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   @Nullable
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerSetDefaultShippingAddressAction build() {
       return new CustomerSetDefaultShippingAddressActionImpl(addressId);
   }
   
   public static CustomerSetDefaultShippingAddressActionBuilder of() {
      return new CustomerSetDefaultShippingAddressActionBuilder();
   }
   
   public static CustomerSetDefaultShippingAddressActionBuilder of(final CustomerSetDefaultShippingAddressAction template) {
      CustomerSetDefaultShippingAddressActionBuilder builder = new CustomerSetDefaultShippingAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}