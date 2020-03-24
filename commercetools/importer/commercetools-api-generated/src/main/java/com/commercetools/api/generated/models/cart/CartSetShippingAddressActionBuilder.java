package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.cart.CartSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   public CartSetShippingAddressActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public CartSetShippingAddressAction build() {
       return new CartSetShippingAddressActionImpl(address);
   }
   
   public static CartSetShippingAddressActionBuilder of() {
      return new CartSetShippingAddressActionBuilder();
   }
   
   public static CartSetShippingAddressActionBuilder of(final CartSetShippingAddressAction template) {
      CartSetShippingAddressActionBuilder builder = new CartSetShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}