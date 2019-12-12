package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddPaymentActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = StagedOrderAddPaymentActionImpl.class)
public interface StagedOrderAddPaymentAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public PaymentResourceIdentifier getPayment();

   public void setPayment(final PaymentResourceIdentifier payment);
   
   public static StagedOrderAddPaymentActionImpl of(){
      return new StagedOrderAddPaymentActionImpl();
   }
   

   public static StagedOrderAddPaymentActionImpl of(final StagedOrderAddPaymentAction template) {
      StagedOrderAddPaymentActionImpl instance = new StagedOrderAddPaymentActionImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}