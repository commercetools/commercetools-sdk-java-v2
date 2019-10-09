package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ReturnPaymentState;
import com.commercetools.models.order.OrderSetReturnPaymentStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = OrderSetReturnPaymentStateActionImpl.class)
public interface OrderSetReturnPaymentStateAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("returnItemId")
   public String getReturnItemId();
   
   @NotNull
   @JsonProperty("paymentState")
   public ReturnPaymentState getPaymentState();

   public void setReturnItemId(final String returnItemId);
   
   public void setPaymentState(final ReturnPaymentState paymentState);
   
   public static OrderSetReturnPaymentStateActionImpl of(){
      return new OrderSetReturnPaymentStateActionImpl();
   }
   

   public static OrderSetReturnPaymentStateActionImpl of(final OrderSetReturnPaymentStateAction template) {
      OrderSetReturnPaymentStateActionImpl instance = new OrderSetReturnPaymentStateActionImpl();
      instance.setReturnItemId(template.getReturnItemId());
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}