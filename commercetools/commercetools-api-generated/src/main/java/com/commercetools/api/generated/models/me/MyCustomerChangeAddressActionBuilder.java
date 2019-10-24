package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerChangeAddressAction;
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
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   
   private String addressId;
   
   public MyCustomerChangeAddressActionBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public MyCustomerChangeAddressActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerChangeAddressAction build() {
       return new MyCustomerChangeAddressActionImpl(address, addressId);
   }
   
   public static MyCustomerChangeAddressActionBuilder of() {
      return new MyCustomerChangeAddressActionBuilder();
   }
   
   public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
      MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
      builder.address = template.getAddress();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}