package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerRemoveBillingAddressIdActionBuilder {
   
   
   private String addressId;
   
   public MyCustomerRemoveBillingAddressIdActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerRemoveBillingAddressIdAction build() {
       return new MyCustomerRemoveBillingAddressIdActionImpl(addressId);
   }
   
   public static MyCustomerRemoveBillingAddressIdActionBuilder of() {
      return new MyCustomerRemoveBillingAddressIdActionBuilder();
   }
   
   public static MyCustomerRemoveBillingAddressIdActionBuilder of(final MyCustomerRemoveBillingAddressIdAction template) {
      MyCustomerRemoveBillingAddressIdActionBuilder builder = new MyCustomerRemoveBillingAddressIdActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}
