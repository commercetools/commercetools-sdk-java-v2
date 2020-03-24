package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ReturnPaymentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnPaymentStateActionImpl;

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
@JsonDeserialize(as = StagedOrderSetReturnPaymentStateActionImpl.class)
public interface StagedOrderSetReturnPaymentStateAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("returnItemId")
   public String getReturnItemId();
   
   @NotNull
   @JsonProperty("paymentState")
   public ReturnPaymentState getPaymentState();

   public void setReturnItemId(final String returnItemId);
   
   public void setPaymentState(final ReturnPaymentState paymentState);
   
   public static StagedOrderSetReturnPaymentStateActionImpl of(){
      return new StagedOrderSetReturnPaymentStateActionImpl();
   }
   

   public static StagedOrderSetReturnPaymentStateActionImpl of(final StagedOrderSetReturnPaymentStateAction template) {
      StagedOrderSetReturnPaymentStateActionImpl instance = new StagedOrderSetReturnPaymentStateActionImpl();
      instance.setReturnItemId(template.getReturnItemId());
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}