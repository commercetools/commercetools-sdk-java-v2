package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemovePaymentActionImpl;

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
@JsonDeserialize(as = StagedOrderRemovePaymentActionImpl.class)
public interface StagedOrderRemovePaymentAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public PaymentResourceIdentifier getPayment();

   public void setPayment(final PaymentResourceIdentifier payment);
   
   public static StagedOrderRemovePaymentActionImpl of(){
      return new StagedOrderRemovePaymentActionImpl();
   }
   

   public static StagedOrderRemovePaymentActionImpl of(final StagedOrderRemovePaymentAction template) {
      StagedOrderRemovePaymentActionImpl instance = new StagedOrderRemovePaymentActionImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}