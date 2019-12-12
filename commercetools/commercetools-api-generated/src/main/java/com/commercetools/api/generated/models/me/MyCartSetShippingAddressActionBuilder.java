package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   public MyCartSetShippingAddressActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public MyCartSetShippingAddressAction build() {
       return new MyCartSetShippingAddressActionImpl(address);
   }
   
   public static MyCartSetShippingAddressActionBuilder of() {
      return new MyCartSetShippingAddressActionBuilder();
   }
   
   public static MyCartSetShippingAddressActionBuilder of(final MyCartSetShippingAddressAction template) {
      MyCartSetShippingAddressActionBuilder builder = new MyCartSetShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}