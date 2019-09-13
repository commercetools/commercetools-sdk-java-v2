package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order.OrderAddPaymentActionImpl;

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
@JsonDeserialize(as = OrderAddPaymentActionImpl.class)
public interface OrderAddPaymentAction extends OrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public PaymentResourceIdentifier getPayment();

   public void setPayment(final PaymentResourceIdentifier payment);
   
   public static OrderAddPaymentActionImpl of(){
      return new OrderAddPaymentActionImpl();
   }
   

   public static OrderAddPaymentActionImpl of(final OrderAddPaymentAction template) {
      OrderAddPaymentActionImpl instance = new OrderAddPaymentActionImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}