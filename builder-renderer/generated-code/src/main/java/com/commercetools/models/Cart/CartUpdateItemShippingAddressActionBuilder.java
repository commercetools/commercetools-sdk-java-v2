package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public CartUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
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