package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class)
public interface MyCartApplyDeltaToLineItemShippingDetailsTargetsAction extends MyCartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("targetsDelta")
   public List<ItemShippingTarget> getTargetsDelta();

   public void setLineItemId(final String lineItemId);
   
   public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);
   
   public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl of(){
      return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
   }
   

   public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl of(final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
      MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setTargetsDelta(template.getTargetsDelta());
      return instance;
   }

}