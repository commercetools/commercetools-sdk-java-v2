package com.commercetools.models.Me;

import com.commercetools.models.Cart.ItemShippingTarget;
import com.commercetools.models.Me.MyCartUpdateAction;
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
public final class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl implements MyCartApplyDeltaToLineItemShippingDetailsTargetsAction {

   private java.lang.String action;
   
   private java.lang.String lineItemId;
   
   private java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta;

   @JsonCreator
   MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta) {
      this.lineItemId = lineItemId;
      this.targetsDelta = targetsDelta;
      this.action = "applyDeltaToLineItemShippingDetailsTargets";
   }
   public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setTargetsDelta(final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta){
      this.targetsDelta = targetsDelta;
   }

}