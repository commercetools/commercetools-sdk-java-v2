package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerSetDefaultBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetDefaultBillingAddressActionBuilder {
   
   @Nullable
   private String addressId;
   
   public CustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   @Nullable
   public String getAddressId(){
      return this.addressId;
   }

   public CustomerSetDefaultBillingAddressAction build() {
       return new CustomerSetDefaultBillingAddressActionImpl(addressId);
   }
   
   public static CustomerSetDefaultBillingAddressActionBuilder of() {
      return new CustomerSetDefaultBillingAddressActionBuilder();
   }
   
   public static CustomerSetDefaultBillingAddressActionBuilder of(final CustomerSetDefaultBillingAddressAction template) {
      CustomerSetDefaultBillingAddressActionBuilder builder = new CustomerSetDefaultBillingAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}