package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomLineItemTaxRateActionBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   public CartSetCustomLineItemTaxRateActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public CartSetCustomLineItemTaxRateAction build() {
       return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
   }
   
   public static CartSetCustomLineItemTaxRateActionBuilder of() {
      return new CartSetCustomLineItemTaxRateActionBuilder();
   }
   
   public static CartSetCustomLineItemTaxRateActionBuilder of(final CartSetCustomLineItemTaxRateAction template) {
      CartSetCustomLineItemTaxRateActionBuilder builder = new CartSetCustomLineItemTaxRateActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}