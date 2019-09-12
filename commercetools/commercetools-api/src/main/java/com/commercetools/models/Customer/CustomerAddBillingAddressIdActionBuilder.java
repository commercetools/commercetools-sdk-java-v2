package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerAddBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddBillingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public CustomerAddBillingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerAddBillingAddressIdAction build() {
       return new CustomerAddBillingAddressIdActionImpl(addressId);
   }
   
   public static CustomerAddBillingAddressIdActionBuilder of() {
      return new CustomerAddBillingAddressIdActionBuilder();
   }
   
   public static CustomerAddBillingAddressIdActionBuilder of(final CustomerAddBillingAddressIdAction template) {
      CustomerAddBillingAddressIdActionBuilder builder = new CustomerAddBillingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}