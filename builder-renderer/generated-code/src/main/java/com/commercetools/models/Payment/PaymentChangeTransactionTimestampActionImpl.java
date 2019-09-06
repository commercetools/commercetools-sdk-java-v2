package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentChangeTransactionTimestampActionImpl implements PaymentChangeTransactionTimestampAction {

   private java.lang.String action;
   
   private java.lang.String transactionId;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   PaymentChangeTransactionTimestampActionImpl(@JsonProperty("transactionId") final java.lang.String transactionId, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.transactionId = transactionId;
      this.timestamp = timestamp;
      this.action = "changeTransactionTimestamp";
   }
   public PaymentChangeTransactionTimestampActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getTransactionId(){
      return this.transactionId;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setTransactionId(final java.lang.String transactionId){
      this.transactionId = transactionId;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}