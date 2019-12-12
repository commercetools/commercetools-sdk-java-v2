package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.cart.CartChangeLineItemQuantityAction;
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
public final class CartChangeLineItemQuantityActionBuilder {
   
   
   private Integer quantity;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money externalPrice;
   
   public CartChangeLineItemQuantityActionBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.api.generated.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public CartChangeLineItemQuantityAction build() {
       return new CartChangeLineItemQuantityActionImpl(quantity, externalTotalPrice, lineItemId, externalPrice);
   }
   
   public static CartChangeLineItemQuantityActionBuilder of() {
      return new CartChangeLineItemQuantityActionBuilder();
   }
   
   public static CartChangeLineItemQuantityActionBuilder of(final CartChangeLineItemQuantityAction template) {
      CartChangeLineItemQuantityActionBuilder builder = new CartChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}