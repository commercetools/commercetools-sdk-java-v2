package com.commercetools.models.cart;


import com.commercetools.models.cart.ItemShippingTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ItemShippingTargetBuilder {
   
   
   private Integer quantity;
   
   
   private String addressKey;
   
   public ItemShippingTargetBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ItemShippingTargetBuilder addressKey( final String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public String getAddressKey(){
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