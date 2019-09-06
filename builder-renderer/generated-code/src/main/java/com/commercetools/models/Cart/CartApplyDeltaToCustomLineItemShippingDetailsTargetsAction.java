package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ItemShippingTarget;
import java.lang.String;
import com.commercetools.models.Cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl;

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
@JsonDeserialize(as = CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("targetsDelta")
   public List<ItemShippingTarget> getTargetsDelta();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);
   
   public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl of(){
      return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
   }
   

   public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl of(final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
      CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setTargetsDelta(template.getTargetsDelta());
      return instance;
   }

}