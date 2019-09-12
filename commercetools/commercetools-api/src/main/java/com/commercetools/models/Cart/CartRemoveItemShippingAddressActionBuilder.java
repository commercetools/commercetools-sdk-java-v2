package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemoveItemShippingAddressActionBuilder {
   
   
   private java.lang.String addressKey;
   
   public CartRemoveItemShippingAddressActionBuilder addressKey( final java.lang.String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public CartRemoveItemShippingAddressAction build() {
       return new CartRemoveItemShippingAddressActionImpl(addressKey);
   }
   
   public static CartRemoveItemShippingAddressActionBuilder of() {
      return new CartRemoveItemShippingAddressActionBuilder();
   }
   
   public static CartRemoveItemShippingAddressActionBuilder of(final CartRemoveItemShippingAddressAction template) {
      CartRemoveItemShippingAddressActionBuilder builder = new CartRemoveItemShippingAddressActionBuilder();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}