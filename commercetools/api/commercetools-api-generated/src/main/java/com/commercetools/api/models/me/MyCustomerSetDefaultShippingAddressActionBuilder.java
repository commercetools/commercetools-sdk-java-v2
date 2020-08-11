package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetDefaultShippingAddressActionBuilder {

   @Nullable
   private String addressId;

   public MyCustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
      this.addressId = addressId;
      return this;
   }

   @Nullable
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerSetDefaultShippingAddressAction build() {
       return new MyCustomerSetDefaultShippingAddressActionImpl(addressId);
   }

   public static MyCustomerSetDefaultShippingAddressActionBuilder of() {
      return new MyCustomerSetDefaultShippingAddressActionBuilder();
   }

   public static MyCustomerSetDefaultShippingAddressActionBuilder of(final MyCustomerSetDefaultShippingAddressAction template) {
      MyCustomerSetDefaultShippingAddressActionBuilder builder = new MyCustomerSetDefaultShippingAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }

}
