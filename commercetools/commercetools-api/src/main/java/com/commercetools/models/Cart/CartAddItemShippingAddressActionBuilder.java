package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Cart.CartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.Common.Address address;
   
   public CartAddItemShippingAddressActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public CartAddItemShippingAddressAction build() {
       return new CartAddItemShippingAddressActionImpl(address);
   }
   
   public static CartAddItemShippingAddressActionBuilder of() {
      return new CartAddItemShippingAddressActionBuilder();
   }
   
   public static CartAddItemShippingAddressActionBuilder of(final CartAddItemShippingAddressAction template) {
      CartAddItemShippingAddressActionBuilder builder = new CartAddItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}