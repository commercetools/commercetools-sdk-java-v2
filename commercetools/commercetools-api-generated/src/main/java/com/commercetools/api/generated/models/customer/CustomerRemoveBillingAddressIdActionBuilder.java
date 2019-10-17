package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerRemoveBillingAddressIdActionBuilder {
   
   
   private String addressId;
   
   public CustomerRemoveBillingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
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