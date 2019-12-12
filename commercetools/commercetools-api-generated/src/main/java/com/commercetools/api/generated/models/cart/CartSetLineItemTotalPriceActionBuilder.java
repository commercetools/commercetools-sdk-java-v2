package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.cart.CartSetLineItemTotalPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetLineItemTotalPriceActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   public CartSetLineItemTotalPriceActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartSetLineItemTotalPriceActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
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