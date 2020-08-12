package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionDraft;
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
public final class PaymentAddTransactionActionImpl implements PaymentAddTransactionAction {

   private String action;
   
   private com.commercetools.api.models.payment.TransactionDraft transaction;

   @JsonCreator
   PaymentAddTransactionActionImpl(@JsonProperty("transaction") final com.commercetools.api.models.payment.TransactionDraft transaction) {
      this.transaction = transaction;
      this.action = "addTransaction";
   }
   public PaymentAddTransactionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.payment.TransactionDraft getTransaction(){
      return this.transaction;
   }

   public void setTransaction(final com.commercetools.api.models.payment.TransactionDraft transaction){
      this.transaction = transaction;
   }

}
