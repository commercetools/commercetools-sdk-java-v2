package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxAmountDraft;
import com.commercetools.models.cart.CartSetCustomLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomLineItemTaxAmountActionBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public CartSetCustomLineItemTaxAmountActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public CartSetCustomLineItemTaxAmountAction build() {
       return new CartSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
   }
   
   public static CartSetCustomLineItemTaxAmountActionBuilder of() {
      return new CartSetCustomLineItemTaxAmountActionBuilder();
   }
   
   public static CartSetCustomLineItemTaxAmountActionBuilder of(final CartSetCustomLineItemTaxAmountAction template) {
      CartSetCustomLineItemTaxAmountActionBuilder builder = new CartSetCustomLineItemTaxAmountActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}