package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import com.commercetools.models.Payment.TransactionState;
import java.lang.String;
import com.commercetools.models.Payment.PaymentChangeTransactionStateActionImpl;

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
@JsonDeserialize(as = PaymentChangeTransactionStateActionImpl.class)
public interface PaymentChangeTransactionStateAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();
   
   @NotNull
   @JsonProperty("state")
   public TransactionState getState();

   public void setTransactionId(final String transactionId);
   
   public void setState(final TransactionState state);
   
   public static PaymentChangeTransactionStateActionImpl of(){
      return new PaymentChangeTransactionStateActionImpl();
   }
   

   public static PaymentChangeTransactionStateActionImpl of(final PaymentChangeTransactionStateAction template) {
      PaymentChangeTransactionStateActionImpl instance = new PaymentChangeTransactionStateActionImpl();
      instance.setState(template.getState());
      instance.setTransactionId(template.getTransactionId());
      return instance;
   }

}