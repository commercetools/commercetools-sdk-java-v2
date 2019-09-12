package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerRemoveBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerRemoveBillingAddressIdActionBuilder {
   
   
   private java.lang.String addressId;
   
   public CustomerRemoveBillingAddressIdActionBuilder addressId( final java.lang.String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public CustomerRemoveBillingAddressIdAction build() {
       return new CustomerRemoveBillingAddressIdActionImpl(addressId);
   }
   
   public static CustomerRemoveBillingAddressIdActionBuilder of() {
      return new CustomerRemoveBillingAddressIdActionBuilder();
   }
   
   public static CustomerRemoveBillingAddressIdActionBuilder of(final CustomerRemoveBillingAddressIdAction template) {
      CustomerRemoveBillingAddressIdActionBuilder builder = new CustomerRemoveBillingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}