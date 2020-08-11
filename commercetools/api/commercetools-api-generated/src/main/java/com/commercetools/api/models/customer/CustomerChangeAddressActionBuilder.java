package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerChangeAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerChangeAddressActionBuilder {
   
   
   private com.commercetools.api.models.common.Address address;
   
   
   private String addressId;
   
   public CustomerChangeAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public CustomerChangeAddressActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public CustomerChangeAddressAction build() {
       return new CustomerChangeAddressActionImpl(address, addressId);
   }
   
   public static CustomerChangeAddressActionBuilder of() {
      return new CustomerChangeAddressActionBuilder();
   }
   
   public static CustomerChangeAddressActionBuilder of(final CustomerChangeAddressAction template) {
      CustomerChangeAddressActionBuilder builder = new CustomerChangeAddressActionBuilder();
      builder.address = template.getAddress();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}
