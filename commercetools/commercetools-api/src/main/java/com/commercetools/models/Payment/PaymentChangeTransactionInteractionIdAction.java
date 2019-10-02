package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentChangeTransactionInteractionIdActionImpl;

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
@JsonDeserialize(as = PaymentChangeTransactionInteractionIdActionImpl.class)
public interface PaymentChangeTransactionInteractionIdAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();
   
   @NotNull
   @JsonProperty("interactionId")
   public String getInteractionId();

   public void setTransactionId(final String transactionId);
   
   public void setInteractionId(final String interactionId);
   
   public static PaymentChangeTransactionInteractionIdActionImpl of(){
      return new PaymentChangeTransactionInteractionIdActionImpl();
   }
   

   public static PaymentChangeTransactionInteractionIdActionImpl of(final PaymentChangeTransactionInteractionIdAction template) {
      PaymentChangeTransactionInteractionIdActionImpl instance = new PaymentChangeTransactionInteractionIdActionImpl();
      instance.setInteractionId(template.getInteractionId());
      instance.setTransactionId(template.getTransactionId());
      return instance;
   }

}