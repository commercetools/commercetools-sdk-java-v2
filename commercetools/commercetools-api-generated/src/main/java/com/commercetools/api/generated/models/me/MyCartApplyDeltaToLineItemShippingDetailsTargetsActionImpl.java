package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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

   private String action;
   
   private String lineItemId;
   
   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta;

   @JsonCreator
   MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta) {
      this.lineItemId = lineItemId;
      this.targetsDelta = targetsDelta;
      this.action = "applyDeltaToLineItemShippingDetailsTargets";
   }
   public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setTargetsDelta(final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta){
      this.targetsDelta = targetsDelta;
   }

}