package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private java.lang.String lineItemId;
   
   public CartSetLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartSetLineItemTaxRateActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public CartSetLineItemTaxRateAction build() {
       return new CartSetLineItemTaxRateActionImpl(externalTaxRate, lineItemId);
   }
   
   public static CartSetLineItemTaxRateActionBuilder of() {
      return new CartSetLineItemTaxRateActionBuilder();
   }
   
   public static CartSetLineItemTaxRateActionBuilder of(final CartSetLineItemTaxRateAction template) {
      CartSetLineItemTaxRateActionBuilder builder = new CartSetLineItemTaxRateActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}