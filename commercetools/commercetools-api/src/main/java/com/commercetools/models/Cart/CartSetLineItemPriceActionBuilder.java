package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart.CartSetLineItemPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemPriceActionBuilder {
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.models.common.Money externalPrice;
   
   public CartSetLineItemPriceActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartSetLineItemPriceActionBuilder externalPrice(@Nullable final com.commercetools.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.common.Money getExternalPrice(){
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