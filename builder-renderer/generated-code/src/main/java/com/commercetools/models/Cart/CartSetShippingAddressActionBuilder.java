package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public CartSetShippingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
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