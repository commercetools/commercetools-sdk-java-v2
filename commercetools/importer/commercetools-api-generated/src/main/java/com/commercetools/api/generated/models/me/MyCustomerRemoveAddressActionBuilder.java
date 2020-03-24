package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerRemoveAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerRemoveAddressActionBuilder {
   
   
   private String addressId;
   
   public MyCustomerRemoveAddressActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerRemoveAddressAction build() {
       return new MyCustomerRemoveAddressActionImpl(addressId);
   }
   
   public static MyCustomerRemoveAddressActionBuilder of() {
      return new MyCustomerRemoveAddressActionBuilder();
   }
   
   public static MyCustomerRemoveAddressActionBuilder of(final MyCustomerRemoveAddressAction template) {
      MyCustomerRemoveAddressActionBuilder builder = new MyCustomerRemoveAddressActionBuilder();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}