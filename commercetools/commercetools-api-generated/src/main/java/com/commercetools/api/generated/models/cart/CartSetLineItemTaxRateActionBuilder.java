package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.CartSetLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetLineItemTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private String lineItemId;
   
   public CartSetLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartSetLineItemTaxRateActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public String getLineItemId(){
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