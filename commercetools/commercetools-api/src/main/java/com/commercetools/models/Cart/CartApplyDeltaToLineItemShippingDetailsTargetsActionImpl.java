package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingTarget;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl implements CartApplyDeltaToLineItemShippingDetailsTargetsAction {

   private java.lang.String action;
   
   private java.lang.String lineItemId;
   
   private java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta;

   @JsonCreator
   CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta) {
      this.lineItemId = lineItemId;
      this.targetsDelta = targetsDelta;
      this.action = "applyDeltaToLineItemShippingDetailsTargets";
   }
   public CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setTargetsDelta(final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta){
      this.targetsDelta = targetsDelta;
   }

}