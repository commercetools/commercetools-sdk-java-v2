package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.PaymentState;
import java.lang.String;
import com.commercetools.models.Order.OrderChangePaymentStateActionImpl;

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
@JsonDeserialize(as = OrderChangePaymentStateActionImpl.class)
public interface OrderChangePaymentStateAction extends OrderUpdateAction {

   
   
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();

   public void setPaymentState(final PaymentState paymentState);
   
   public static OrderChangePaymentStateActionImpl of(){
      return new OrderChangePaymentStateActionImpl();
   }
   

   public static OrderChangePaymentStateActionImpl of(final OrderChangePaymentStateAction template) {
      OrderChangePaymentStateActionImpl instance = new OrderChangePaymentStateActionImpl();
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}