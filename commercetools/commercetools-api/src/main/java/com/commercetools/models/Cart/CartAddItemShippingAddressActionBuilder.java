package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.common.Address;
import java.lang.String;
import com.commercetools.models.cart.CartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public CartAddItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
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