package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ItemShippingTarget;
import java.lang.String;
import com.commercetools.models.Cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToLineItemShippingDetailsTargetsAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("targetsDelta")
   public List<ItemShippingTarget> getTargetsDelta();

   public void setLineItemId(final String lineItemId);
   
   public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);
   
   public static CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl of(){
      return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
   }
   

   public static CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl of(final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
      CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setTargetsDelta(template.getTargetsDelta());
      return instance;
   }

}