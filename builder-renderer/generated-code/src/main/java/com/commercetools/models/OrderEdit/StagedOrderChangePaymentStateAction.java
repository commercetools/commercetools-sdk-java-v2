package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.PaymentState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangePaymentStateActionImpl;

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
@JsonDeserialize(as = StagedOrderChangePaymentStateActionImpl.class)
public interface StagedOrderChangePaymentStateAction extends StagedOrderUpdateAction {

   
   
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();

   public void setPaymentState(final PaymentState paymentState);
   
   public static StagedOrderChangePaymentStateActionImpl of(){
      return new StagedOrderChangePaymentStateActionImpl();
   }
   

   public static StagedOrderChangePaymentStateActionImpl of(final StagedOrderChangePaymentStateAction template) {
      StagedOrderChangePaymentStateActionImpl instance = new StagedOrderChangePaymentStateActionImpl();
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}