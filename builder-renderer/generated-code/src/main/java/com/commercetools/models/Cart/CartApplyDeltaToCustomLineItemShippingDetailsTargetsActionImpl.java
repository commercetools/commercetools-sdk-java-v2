package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ItemShippingTarget;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl implements CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta;

   @JsonCreator
   CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta) {
      this.customLineItemId = customLineItemId;
      this.targetsDelta = targetsDelta;
      this.action = "applyDeltaToCustomLineItemShippingDetailsTargets";
   }
   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setTargetsDelta(final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta){
      this.targetsDelta = targetsDelta;
   }

}