package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerAddAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerAddAddressActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   public MyCustomerAddAddressActionBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public MyCustomerAddAddressAction build() {
       return new MyCustomerAddAddressActionImpl(address);
   }
   
   public static MyCustomerAddAddressActionBuilder of() {
      return new MyCustomerAddAddressActionBuilder();
   }
   
   public static MyCustomerAddAddressActionBuilder of(final MyCustomerAddAddressAction template) {
      MyCustomerAddAddressActionBuilder builder = new MyCustomerAddAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}