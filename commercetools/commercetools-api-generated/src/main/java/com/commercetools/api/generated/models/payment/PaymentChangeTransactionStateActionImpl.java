package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.TransactionState;
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
public final class PaymentChangeTransactionStateActionImpl implements PaymentChangeTransactionStateAction {

   private String action;
   
   private com.commercetools.api.generated.models.payment.TransactionState state;
   
   private String transactionId;

   @JsonCreator
   PaymentChangeTransactionStateActionImpl(@JsonProperty("state") final com.commercetools.api.generated.models.payment.TransactionState state, @JsonProperty("transactionId") final String transactionId) {
      this.state = state;
      this.transactionId = transactionId;
      this.action = "changeTransactionState";
   }
   public PaymentChangeTransactionStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public String getTransactionId(){
      return this.transactionId;
   }

   public void setState(final com.commercetools.api.generated.models.payment.TransactionState state){
      this.state = state;
   }
   
   public void setTransactionId(final String transactionId){
      this.transactionId = transactionId;
   }

}