package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingTarget;
import com.commercetools.api.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
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
    
    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    @JsonCreator
    MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
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
    
    
    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta(){
        return this.targetsDelta;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setTargetsDelta(final com.commercetools.api.models.cart.ItemShippingTarget ...targetsDelta){
       this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
    }
    
    public void setTargetsDelta(final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta){
       this.targetsDelta = targetsDelta;
    }

}
