package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemoveItemShippingAddressActionBuilder {
   
   
   private String addressKey;
   
   public MyCartRemoveItemShippingAddressActionBuilder addressKey( final String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public String getAddressKey(){
      return this.addressKey;
   }

   public MyCartRemoveItemShippingAddressAction build() {
       return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
   }
   
   public static MyCartRemoveItemShippingAddressActionBuilder of() {
      return new MyCartRemoveItemShippingAddressActionBuilder();
   }
   
   public static MyCartRemoveItemShippingAddressActionBuilder of(final MyCartRemoveItemShippingAddressAction template) {
      MyCartRemoveItemShippingAddressActionBuilder builder = new MyCartRemoveItemShippingAddressActionBuilder();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}