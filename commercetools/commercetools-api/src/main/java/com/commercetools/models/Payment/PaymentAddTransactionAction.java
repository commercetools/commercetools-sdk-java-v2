package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import com.commercetools.models.Payment.TransactionDraft;
import java.lang.String;
import com.commercetools.models.Payment.PaymentAddTransactionActionImpl;

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
@JsonDeserialize(as = PaymentAddTransactionActionImpl.class)
public interface PaymentAddTransactionAction extends PaymentUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("transaction")
   public TransactionDraft getTransaction();

   public void setTransaction(final TransactionDraft transaction);
   
   public static PaymentAddTransactionActionImpl of(){
      return new PaymentAddTransactionActionImpl();
   }
   

   public static PaymentAddTransactionActionImpl of(final PaymentAddTransactionAction template) {
      PaymentAddTransactionActionImpl instance = new PaymentAddTransactionActionImpl();
      instance.setTransaction(template.getTransaction());
      return instance;
   }

}