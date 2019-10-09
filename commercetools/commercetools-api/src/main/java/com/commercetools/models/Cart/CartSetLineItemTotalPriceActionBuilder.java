package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.CartSetLineItemTotalPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemTotalPriceActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   public CartSetLineItemTotalPriceActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartSetLineItemTotalPriceActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public CartSetLineItemTotalPriceAction build() {
       return new CartSetLineItemTotalPriceActionImpl(externalTotalPrice, lineItemId);
   }
   
   public static CartSetLineItemTotalPriceActionBuilder of() {
      return new CartSetLineItemTotalPriceActionBuilder();
   }
   
   public static CartSetLineItemTotalPriceActionBuilder of(final CartSetLineItemTotalPriceAction template) {
      CartSetLineItemTotalPriceActionBuilder builder = new CartSetLineItemTotalPriceActionBuilder();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}