package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddShippingAddressIdActionBuilder {


   private String addressId;

   public CustomerAddShippingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }


   public String getAddressId(){
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
