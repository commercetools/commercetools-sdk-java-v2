package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetDefaultShippingAddressActionBuilder {

   @Nullable
   private String addressId;

   public CustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
      this.addressId = addressId;
      return this;
   }

   @Nullable
   public String getAddressId(){
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
