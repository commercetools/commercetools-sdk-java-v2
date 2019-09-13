package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.TransactionDraft;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentAddTransactionActionImpl implements PaymentAddTransactionAction {

   private java.lang.String action;
   
   private com.commercetools.models.payment.TransactionDraft transaction;

   @JsonCreator
   PaymentAddTransactionActionImpl(@JsonProperty("transaction") final com.commercetools.models.payment.TransactionDraft transaction) {
      this.transaction = transaction;
      this.action = "addTransaction";
   }
   public PaymentAddTransactionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.payment.TransactionDraft getTransaction(){
      return this.transaction;
   }

   public void setTransaction(final com.commercetools.models.payment.TransactionDraft transaction){
      this.transaction = transaction;
   }

}