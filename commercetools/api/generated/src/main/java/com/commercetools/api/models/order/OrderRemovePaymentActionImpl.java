package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderRemovePaymentActionImpl implements OrderRemovePaymentAction {

   private String action;

   private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

   @JsonCreator
   OrderRemovePaymentActionImpl(@JsonProperty("payment") final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      this.action = "removePayment";
   }
   public OrderRemovePaymentActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public void setPayment(final com.commercetools.api.models.payment.PaymentResourceIdentifier payment){
      this.payment = payment;
   }

}
