package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerAddBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddBillingAddressIdActionBuilder {
   
   
   private String addressId;
   
   public CustomerAddBillingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
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