package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartUpdateItemShippingAddressAction;
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
public final class MyCartUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   public MyCartUpdateItemShippingAddressActionBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public MyCartUpdateItemShippingAddressAction build() {
       return new MyCartUpdateItemShippingAddressActionImpl(address);
   }
   
   public static MyCartUpdateItemShippingAddressActionBuilder of() {
      return new MyCartUpdateItemShippingAddressActionBuilder();
   }
   
   public static MyCartUpdateItemShippingAddressActionBuilder of(final MyCartUpdateItemShippingAddressAction template) {
      MyCartUpdateItemShippingAddressActionBuilder builder = new MyCartUpdateItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}