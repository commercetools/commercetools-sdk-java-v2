package com.commercetools.models.Cart;

import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.ItemShippingTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ItemShippingTargetBuilder {
   
   
   private java.lang.Integer quantity;
   
   
   private java.lang.String addressKey;
   
   public ItemShippingTargetBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ItemShippingTargetBuilder addressKey( final java.lang.String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public ItemShippingTarget build() {
       return new ItemShippingTargetImpl(quantity, addressKey);
   }
   
   public static ItemShippingTargetBuilder of() {
      return new ItemShippingTargetBuilder();
   }
   
   public static ItemShippingTargetBuilder of(final ItemShippingTarget template) {
      ItemShippingTargetBuilder builder = new ItemShippingTargetBuilder();
      builder.quantity = template.getQuantity();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}