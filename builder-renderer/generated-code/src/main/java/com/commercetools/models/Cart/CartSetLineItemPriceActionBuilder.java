package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Money;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemPriceActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Common.Money externalPrice;
   
   public CartSetLineItemPriceActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartSetLineItemPriceActionBuilder externalPrice(@Nullable final com.commercetools.models.Common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public CartSetLineItemPriceAction build() {
       return new CartSetLineItemPriceActionImpl(lineItemId, externalPrice);
   }
   
   public static CartSetLineItemPriceActionBuilder of() {
      return new CartSetLineItemPriceActionBuilder();
   }
   
   public static CartSetLineItemPriceActionBuilder of(final CartSetLineItemPriceAction template) {
      CartSetLineItemPriceActionBuilder builder = new CartSetLineItemPriceActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}