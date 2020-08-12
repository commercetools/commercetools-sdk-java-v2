package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerRemoveShippingAddressIdActionBuilder {
   
   
   private String addressId;
   
   public MyCustomerRemoveShippingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerRemoveShippingAddressIdAction build() {
       return new MyCustomerRemoveShippingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerRemoveShippingAddressIdActionBuilder of() {
      return new MyCustomerRemoveShippingAddressIdActionBuilder();
   }
   
   public static MyCustomerRemoveShippingAddressIdActionBuilder of(final MyCustomerRemoveShippingAddressIdAction template) {
      MyCustomerRemoveShippingAddressIdActionBuilder builder = new MyCustomerRemoveShippingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}
