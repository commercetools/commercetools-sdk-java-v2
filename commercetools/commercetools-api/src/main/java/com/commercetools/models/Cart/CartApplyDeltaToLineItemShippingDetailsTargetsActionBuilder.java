package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingTarget;
import com.commercetools.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder {
   
   
   private String lineItemId;
   
   
   private java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta;
   
   public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta( final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta) {
      this.targetsDelta = targetsDelta;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public CartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
       return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
   }
   
   public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
      return new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
   }
   
   public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
      CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.targetsDelta = template.getTargetsDelta();
      return builder;
   }
   
}