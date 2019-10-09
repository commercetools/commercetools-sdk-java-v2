package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.common.Address;
import com.commercetools.models.cart.CartUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   public CartUpdateItemShippingAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
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