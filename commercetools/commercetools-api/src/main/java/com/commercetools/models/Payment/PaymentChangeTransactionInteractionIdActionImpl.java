package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
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
public final class PaymentChangeTransactionInteractionIdActionImpl implements PaymentChangeTransactionInteractionIdAction {

   private java.lang.String action;
   
   private java.lang.String interactionId;
   
   private java.lang.String transactionId;

   @JsonCreator
   PaymentChangeTransactionInteractionIdActionImpl(@JsonProperty("interactionId") final java.lang.String interactionId, @JsonProperty("transactionId") final java.lang.String transactionId) {
      this.interactionId = interactionId;
      this.transactionId = transactionId;
      this.action = "changeTransactionInteractionId";
   }
   public PaymentChangeTransactionInteractionIdActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public java.lang.String getTransactionId(){
      return this.transactionId;
   }

   public void setInteractionId(final java.lang.String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setTransactionId(final java.lang.String transactionId){
      this.transactionId = transactionId;
   }

}