package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartSetBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetBillingAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public CartSetBillingAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public CartSetBillingAddressAction build() {
       return new CartSetBillingAddressActionImpl(address);
   }
   
   public static CartSetBillingAddressActionBuilder of() {
      return new CartSetBillingAddressActionBuilder();
   }
   
   public static CartSetBillingAddressActionBuilder of(final CartSetBillingAddressAction template) {
      CartSetBillingAddressActionBuilder builder = new CartSetBillingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}