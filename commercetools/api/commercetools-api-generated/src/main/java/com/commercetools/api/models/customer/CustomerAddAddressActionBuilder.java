package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddAddressActionBuilder {
   
   
   private com.commercetools.api.models.common.Address address;
   
   public CustomerAddAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   public CustomerAddAddressAction build() {
       return new CustomerAddAddressActionImpl(address);
   }
   
   public static CustomerAddAddressActionBuilder of() {
      return new CustomerAddAddressActionBuilder();
   }
   
   public static CustomerAddAddressActionBuilder of(final CustomerAddAddressAction template) {
      CustomerAddAddressActionBuilder builder = new CustomerAddAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}
