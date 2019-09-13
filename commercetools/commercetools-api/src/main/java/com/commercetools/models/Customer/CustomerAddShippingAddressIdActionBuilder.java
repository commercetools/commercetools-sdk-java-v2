package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.customer.CustomerAddShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddShippingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public CustomerAddShippingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerAddShippingAddressIdAction build() {
       return new CustomerAddShippingAddressIdActionImpl(addressId);
   }
   
   public static CustomerAddShippingAddressIdActionBuilder of() {
      return new CustomerAddShippingAddressIdActionBuilder();
   }
   
   public static CustomerAddShippingAddressIdActionBuilder of(final CustomerAddShippingAddressIdAction template) {
      CustomerAddShippingAddressIdActionBuilder builder = new CustomerAddShippingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}