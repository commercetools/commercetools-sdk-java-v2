package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder {
   
   
   private String lineItemId;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta;
   
   public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta( final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta) {
      this.targetsDelta = targetsDelta;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargetsDelta(){
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