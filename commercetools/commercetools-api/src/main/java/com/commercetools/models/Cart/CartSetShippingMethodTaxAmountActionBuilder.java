package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxAmountDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetShippingMethodTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingMethodTaxAmountActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public CartSetShippingMethodTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public CartSetShippingMethodTaxAmountAction build() {
       return new CartSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
   }
   
   public static CartSetShippingMethodTaxAmountActionBuilder of() {
      return new CartSetShippingMethodTaxAmountActionBuilder();
   }
   
   public static CartSetShippingMethodTaxAmountActionBuilder of(final CartSetShippingMethodTaxAmountAction template) {
      CartSetShippingMethodTaxAmountActionBuilder builder = new CartSetShippingMethodTaxAmountActionBuilder();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}