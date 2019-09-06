package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxAmountDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemTaxAmountActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public CartSetLineItemTaxAmountActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartSetLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.Cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public CartSetLineItemTaxAmountAction build() {
       return new CartSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount);
   }
   
   public static CartSetLineItemTaxAmountActionBuilder of() {
      return new CartSetLineItemTaxAmountActionBuilder();
   }
   
   public static CartSetLineItemTaxAmountActionBuilder of(final CartSetLineItemTaxAmountAction template) {
      CartSetLineItemTaxAmountActionBuilder builder = new CartSetLineItemTaxAmountActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}