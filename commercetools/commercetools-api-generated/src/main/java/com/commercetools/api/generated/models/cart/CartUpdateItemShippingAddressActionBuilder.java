package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.cart.CartUpdateItemShippingAddressAction;
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
public final class CartUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   public CartUpdateItemShippingAddressActionBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public CartUpdateItemShippingAddressAction build() {
       return new CartUpdateItemShippingAddressActionImpl(address);
   }
   
   public static CartUpdateItemShippingAddressActionBuilder of() {
      return new CartUpdateItemShippingAddressActionBuilder();
   }
   
   public static CartUpdateItemShippingAddressActionBuilder of(final CartUpdateItemShippingAddressAction template) {
      CartUpdateItemShippingAddressActionBuilder builder = new CartUpdateItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}