package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerRemoveShippingAddressIdActionBuilder {
   
   
   private String addressId;
   
   public CustomerRemoveShippingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public CustomerRemoveShippingAddressIdAction build() {
       return new CustomerRemoveShippingAddressIdActionImpl(addressId);
   }
   
   public static CustomerRemoveShippingAddressIdActionBuilder of() {
      return new CustomerRemoveShippingAddressIdActionBuilder();
   }
   
   public static CustomerRemoveShippingAddressIdActionBuilder of(final CustomerRemoveShippingAddressIdAction template) {
      CustomerRemoveShippingAddressIdActionBuilder builder = new CustomerRemoveShippingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}