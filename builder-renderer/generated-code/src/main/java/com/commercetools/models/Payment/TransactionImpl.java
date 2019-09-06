package com.commercetools.models.Payment;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Payment.TransactionState;
import com.commercetools.models.Payment.TransactionType;
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
public final class TransactionImpl implements Transaction {

   private java.lang.String interactionId;
   
   private com.commercetools.models.Common.TypedMoney amount;
   
   private com.commercetools.models.Payment.TransactionState state;
   
   private java.lang.String id;
   
   private com.commercetools.models.Payment.TransactionType type;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   TransactionImpl(@JsonProperty("interactionId") final java.lang.String interactionId, @JsonProperty("amount") final com.commercetools.models.Common.TypedMoney amount, @JsonProperty("state") final com.commercetools.models.Payment.TransactionState state, @JsonProperty("id") final java.lang.String id, @JsonProperty("type") final com.commercetools.models.Payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.state = state;
      this.id = id;
      this.type = type;
      this.timestamp = timestamp;
   }
   public TransactionImpl() {
      
   }
   
   
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmount(){
      return this.amount;
   }
   
   
   public com.commercetools.models.Payment.TransactionState getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Payment.TransactionType getType(){
      return this.type;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final java.lang.String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setAmount(final com.commercetools.models.Common.TypedMoney amount){
      this.amount = amount;
   }
   
   public void setState(final com.commercetools.models.Payment.TransactionState state){
      this.state = state;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setType(final com.commercetools.models.Payment.TransactionType type){
      this.type = type;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}