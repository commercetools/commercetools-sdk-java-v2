package com.commercetools.models.Me;

import com.commercetools.models.Cart.ItemShippingTarget;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta;
   
   public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta( final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta) {
      this.targetsDelta = targetsDelta;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public MyCartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
       return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
   }
   
   public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
      return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
   }
   
   public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
      MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.targetsDelta = template.getTargetsDelta();
      return builder;
   }
   
}