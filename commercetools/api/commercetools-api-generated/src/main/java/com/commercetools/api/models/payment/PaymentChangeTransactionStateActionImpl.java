package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionState;
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
public final class PaymentChangeTransactionStateActionImpl implements PaymentChangeTransactionStateAction {

   private String action;
   
   private String transactionId;
   
   private com.commercetools.api.models.payment.TransactionState state;

   @JsonCreator
   PaymentChangeTransactionStateActionImpl(@JsonProperty("transactionId") final String transactionId, @JsonProperty("state") final com.commercetools.api.models.payment.TransactionState state) {
      this.transactionId = transactionId;
      this.state = state;
      this.action = "changeTransactionState";
   }
   public PaymentChangeTransactionStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getTransactionId(){
      return this.transactionId;
   }
   
   
   public com.commercetools.api.models.payment.TransactionState getState(){
      return this.state;
   }

   public void setTransactionId(final String transactionId){
      this.transactionId = transactionId;
   }
   
   public void setState(final com.commercetools.api.models.payment.TransactionState state){
      this.state = state;
   }

}
