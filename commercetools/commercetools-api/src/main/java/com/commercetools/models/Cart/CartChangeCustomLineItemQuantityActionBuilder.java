package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.cart.CartChangeCustomLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeCustomLineItemQuantityActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.Integer quantity;
   
   public CartChangeCustomLineItemQuantityActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartChangeCustomLineItemQuantityActionBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }

   public CartChangeCustomLineItemQuantityAction build() {
       return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
   }
   
   public static CartChangeCustomLineItemQuantityActionBuilder of() {
      return new CartChangeCustomLineItemQuantityActionBuilder();
   }
   
   public static CartChangeCustomLineItemQuantityActionBuilder of(final CartChangeCustomLineItemQuantityAction template) {
      CartChangeCustomLineItemQuantityActionBuilder builder = new CartChangeCustomLineItemQuantityActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}