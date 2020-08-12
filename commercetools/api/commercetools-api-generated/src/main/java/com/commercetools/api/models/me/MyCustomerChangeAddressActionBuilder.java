package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerChangeAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerChangeAddressActionBuilder {
   
   
   private String addressId;
   
   
   private com.commercetools.api.models.common.Address address;
   
   public MyCustomerChangeAddressActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   public MyCustomerChangeAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }
   
   
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   public MyCustomerChangeAddressAction build() {
       return new MyCustomerChangeAddressActionImpl(addressId, address);
   }
   
   public static MyCustomerChangeAddressActionBuilder of() {
      return new MyCustomerChangeAddressActionBuilder();
   }
   
   public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
      MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
      builder.addressId = template.getAddressId();
      builder.address = template.getAddress();
      return builder;
   }
   
}
